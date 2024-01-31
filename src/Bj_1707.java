import java.io.*;
import java.util.*;

public class Bj_1707 {
	static int v, e;
	static int[] check;
	static boolean[] visited;
	static boolean isBipart;
	static ArrayList<Integer>[] edge;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			
			// static 변수 초기화
			edge = new ArrayList[v+1];
			visited = new boolean [v+1];
			check = new int[v+1];
			isBipart = true;
			
			// 간선정보 입력받기
			for (int i=1; i<=v; i++) {
				edge[i] = new ArrayList<>();
			}
			while (e-- > 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				edge[a].add(b);
				edge[b].add(a);
			}
			
			// 모든 노드에서 DFS 실행
			for (int i=1; i<=v; i++) {
				if (isBipart) {
					DFS(i);
				} else {
					break;
				}
			}
			if (isBipart) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.print(sb.toString());
	}

	private static void DFS(int i) {
		visited[i] = true;
		for (int next : edge[i]) {
			if (!visited[next]) {
				check[next] = (check[i] + 1) % 2;
				DFS(next);
			} else {
				if (check[i] == check[next]) {
					isBipart = false;
				}
			}
		}
	}
}