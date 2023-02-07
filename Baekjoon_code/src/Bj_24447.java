import java.io.*;
import java.util.*;

public class Bj_24447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());	// 정점의 수
		int m = Integer.parseInt(st.nextToken());	// 간선의 수
		int r = Integer.parseInt(st.nextToken());	// 시작 정점
		
		
		// 간선정보 입력받기
		ArrayList<Integer>[] edge = new ArrayList[n+1];	// 간선 정보 저장
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
		
		// BFS 돌리기
		Queue<Integer> q = new LinkedList<>(); // BFS를 위한 큐
		boolean[] visited = new boolean[n+1]; // 방문체크 한번 방문한 정점은 빼기 위함
		long[] dist = new long[n+1]; // 거리 정보
		long[] ans = new long[n+1];	// 도착순서
		Arrays.fill(dist, -1); // 방문 되지 않는 노드의 깊이는 -1로 초기화
		
		int cnt = 0; // 순서정보
		visited[r] = true; // 시작 정점 r을 방문했다고 표시
		q.add(r); // 큐 맨 뒤에 시작 정점 r을 추가
		dist[r] = 0; // 시작 정점 r의 깊이는 0이다
		ans[r] = ++cnt;
		long answer = 0;
		
		while (!q.isEmpty()) {
			int seq = 0;
			int cur = q.poll();
			for (int next : edge[cur]) {
				if (!visited[next]) {
					visited[next] = true; // 다음 정점 next를 방문했다고 표시
					q.add(next); // 큐 맨 뒤에 다음 정점 next를 추가
					dist[next] = dist[cur] + 1; // 다음 정점의 거리는 현재 정점 + 1
					ans[next] = ++cnt;	// 순서정보
					answer += dist[next] * ans[next];
//					System.out.println(dist[next] + " x " + ans[next] + " = " + answer);
				}
			}
		}
//		for (int i=1; i<=n; i++) {
//			sb.append(dist[i]).append("\n");
//		}
//		System.out.print(sb);
		System.out.print(answer);
	}
}