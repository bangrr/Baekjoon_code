import java.io.*;
import java.util.*;

public class Bj_24445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());  // 정점 갯수
		int m = Integer.parseInt(st.nextToken());  // 간선 갯수
		int r = Integer.parseInt(st.nextToken());  // 시작 정점
		
		// 간선정보 입력받기
//mle		boolean[][] edge = new boolean[n+1][n+1];
		ArrayList<Integer>[] edge = new ArrayList[n+1];  // 간선 정보 저장
		for (int i=1; i<=n; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			edge[u].add(v);
			edge[v].add(u);  // 무방향(양방향) 간선이므로 반대방향도 체크
//mle			edge[u][v] = edge[v][u] = true;  // 무방향(양방향) 간선이므로 반대방향도 체크
		}
		
		for (int i=1; i<=n; i++) {
			Collections.sort(edge[i], Collections.reverseOrder());
//			System.out.println(edge[i]);
		}
		
		// BFS 돌리기
		Queue<Integer> q = new LinkedList<>();  // BFS를 위한 큐
		boolean[] visited = new boolean[n+1];  // 방문체크 한번 방문한 정점은 빼기 위함
		int[] order = new int[n+1];  // 거리정보
		int idx = 0;
		
		visited[r] = true;
		q.add(r);
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			order[cur] = ++idx;  // 순서정보
			for (int next : edge[cur]) {
				if (!visited[next]) {
					q.add(next);  // 다음 간선 번호를 큐에 넣음
					visited[next] = true;  // 방문 체크
				}
			}
		}
		
		for (int i=1; i<=n; i++) {
			sb.append(order[i]).append("\n");
		}
		System.out.print(sb);
	}
}