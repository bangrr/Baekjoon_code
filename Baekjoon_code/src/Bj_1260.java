import java.io.*;
import java.util.*;

public class Bj_1260 {
	static StringBuilder sb = new StringBuilder();
	static int n, m, r;
	
	// 간선에 대한 정보를 하나만 저장해 놓아도 DFS, BFS에 둘 다 사용할 수 있다.
	static ArrayList<Integer>[] edge; // 간선 정보 저장
	
	static boolean[] visitedD; // DFS 방문체크를 위한 배열
	
	static Queue<Integer> q = new LinkedList<>(); // BFS를 위한 큐
	static boolean[] visitedB; // BFS 방문체크를 위한 배열
	
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
			edge[b].add(a);
		}
		for (int i=1; i<=n; i++) {
			Collections.sort(edge[i]);
		}
		
		visitedD = new boolean[n+1];
		dfs(n, m, r);
		
		sb.append("\n");
		
		visitedB = new boolean[n+1];
		bfs(n, m, r);
		
		System.out.print(sb.toString());
	}
	
	static void dfs(int n, int m, int r) {
		sb.append(r).append(" ");
		visitedD[r] = true;
		for (int next : edge[r]) {
			if (!visitedD[next]) {
				dfs(n, m, next);
			}
		}
	}
	
	static void bfs(int n, int m, int r) {
		visitedB[r] = true;
		q.add(r);
		sb.append(r).append(" ");
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : edge[cur]) {
				if (!visitedB[next]) {
					visitedB[next] = true; // 다음 정점 next를 방문했다고 표시
					sb.append(next).append(" ");
					q.add(next); // 큐 맨 뒤에 다음 정점 next를 추가
				}
			}
		}
	}
}