import java.io.*;
import java.util.*;

public class Bj_24444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());	// 정점의 수
		int m = Integer.parseInt(st.nextToken());	// 간선의 수
		int r = Integer.parseInt(st.nextToken());	// 시작 정점
		
		
		// 간선정보 입력받기
		@SuppressWarnings("unchecked")
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
		
		// BFS 진행
		Queue<Integer> q = new LinkedList<>();	// BFS를 위한 큐
		boolean[] visited = new boolean[n+1];	// 방문체크
		int[] ans = new int[n+1];	// 도착순서
		Arrays.fill(ans, 0);
		
		int cnt = 0;
		visited[r] = true;
		q.add(r);
		ans[r] = ++cnt;
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : edge[cur]) {
				if (visited[next]) {
					continue;	// 이미 방문했다면 무시
				}
				q.add(next);	// 다음 간선 번호를 큐에 넣음
				visited[next] = true;	// 방문체크
				ans[next] = ++cnt;	// 순서정보
			}
		}
		for (int i=1; i<=n; i++) {
			sb.append(ans[i] + "\n");
		}
		System.out.print(sb);
	}
}