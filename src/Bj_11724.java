import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj_11724 {
	static ArrayList<Integer>[] edge;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
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
		
		Stack<Integer> stack = new Stack<>();
		visited = new boolean[n+1];
		int ans = 0;
		for (int i=1; i<=n; i++) {
			if (!visited[i]) {
				ans++;
				DFS(i);
//				stack.push(i);
//				visited[i] = true;
//				while (!stack.isEmpty()) {
//					int cur = stack.pop();
//					for (int next : edge[cur]) {
//						if (visited[next]) {
//							continue;
//						}
//						stack.push(next);
//						visited[next] = true;
//					}
//				}
			}
		}
		System.out.print(ans);
	}
	
	static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		visited[v] = true;
		for (int w : edge[v]) {
			if (!visited[w]) {
				DFS(w);
			}
		}
	}
}