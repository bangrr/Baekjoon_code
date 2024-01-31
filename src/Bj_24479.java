import java.io.*;
import java.util.*;

public class Bj_24479 {
	static StringBuilder sb = new StringBuilder();
	static int n, m, r;
	static ArrayList<Integer>[] edge; // 간선 정보 저장
	static boolean[] visited; // 방문체크 한번 방문한 정점은 빼기 위함
	static int cnt = 0;
	static int[] order;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 정점 갯수
		m = Integer.parseInt(st.nextToken()); // 간선 갯수
		r = Integer.parseInt(st.nextToken()); // 시작 정점
		
		// 간선정보 입력받기
		edge = new ArrayList[n+1];
		for (int i=1; i<=n; i++) {
			edge[i] = new ArrayList<>();
		}
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
			edge[b].add(a); // 양방향이므로 반대로도 넣기
		}
		for (int i=1; i<=n; i++) {
			Collections.sort(edge[i]);
		}
		
		visited = new boolean[n+1];
		order = new int[n+1];
		dfs(n, m, r);
		
		for (int i=1; i<=n; i++) {
			sb.append(order[i]).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	static void dfs(int n, int m, int r) {
		visited[r] = true;
		order[r] = ++cnt;
		for (int next : edge[r]) {
			if (!visited[next]) {
				dfs(n, m, next);
			}
		}
	}
}