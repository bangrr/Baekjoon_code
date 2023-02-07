import java.io.*;
import java.util.*;

public class Bj_24446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()); // 정점 갯수
		int m = Integer.parseInt(st.nextToken()); // 간선 갯수
		int r = Integer.parseInt(st.nextToken()); // 시작 정점
		
		// 간선 정보 입력받기
		ArrayList<Integer>[] edge = new ArrayList[n+1]; // 간선 정보 저장
		for (int i=1; i<=n; i++) { // 정점 갯수만큼 리스트를 만들고
			edge[i] = new ArrayList<>();
		}
		for (int i=0; i<m; i++) { // 간선 갯수만큼 리스트에 값을 채운다
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			edge[u].add(v);
			edge[v].add(u); // 무방향(양방향) 그래프이므로 반대방향도 체크
		}
		
		// BFS 돌리기
		Queue<Integer> q = new LinkedList<>(); // BFS를 위한 큐
		boolean[] visited = new boolean[n+1]; // 방문체크 한번 방문한 정점은 빼기 위함
		int[] dist = new int[n+1]; // 거리 정보
		Arrays.fill(dist, -1); // 방문 되지 않는 노드의 깊이는 -1로 초기화
		
		visited[r] = true; // 시작 정점 r을 방문했다고 표시
		q.add(r); // 큐 맨 뒤에 시작 정점 r을 추가
		dist[r] = 0; // 시작 정점 r의 깊이는 0이다
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : edge[cur]) {
				if (!visited[next]) {
					visited[next] = true; // 다음 정점 next를 방문했다고 표시
					q.add(next); // 큐 맨 뒤에 다음 정점 next를 추가
					dist[next] = dist[cur] + 1; // 다음 정점의 거리는 현재 정점 + 1
				}
			}
		}
		for (int i=1; i<=n; i++) {
			sb.append(dist[i]).append("\n");
		}
		System.out.print(sb);
	}
}