import java.io.*;
import java.util.*;

public class Bj_24481 {
	static StringBuilder sb = new StringBuilder();
	static int n, m, r;
	static ArrayList<Integer>[] edge; // 간선 정보 저장
	static boolean[] visited; // 방문체크 한번 방문한 정점은 빼기 위함
	static int[] depth;
	
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
		depth = new int[n+1];
		Arrays.fill(depth, -1); // 방문되지 않은 노드의 깊이는 -1
		depth[r] = 0;
		dfs(n, m, r);
		
		for (int i=1; i<=n; i++) {
			sb.append(depth[i]).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	static void dfs(int n, int m, int r) {
		visited[r] = true;
		for (int next : edge[r]) {
			if (!visited[next]) {
				depth[next] = depth[r]+1;
				//System.out.println(next + " " + depth[next]);
				dfs(n, m, next);
			}
		}
	}
}