import java.io.*;
import java.util.*;

public class Bj_1389 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int n, m;
	static int[] dist;
	static ArrayList<Integer>[] list;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n+1];
		for (int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		dist = new int[n+1];
		int minCnt = Integer.MAX_VALUE;
		int minIdx = 0;
		for (int i=1; i<=n; i++) {
			int cnt = BFS(i);
			if (minCnt > cnt) {
				minCnt = cnt;
				minIdx = i;
			}
		}
		System.out.print(minIdx);
	}
	
	static int BFS(int idx) {
		Arrays.fill(dist, -1);
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(idx);
		dist[idx] = 0;
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : list[cur]) {
				if (dist[next] != -1) continue;
				dist[next] = dist[cur] + 1;
				cnt += dist[next];
				q.add(next);
			}
		}
		return cnt;
	}
}