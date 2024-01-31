import java.io.*;
import java.util.*;
 
public class Bj_2644 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static ArrayList<Integer>[] edge;
	static boolean[] visited;
    static int ans = -1;
 
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
 
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
		visited = new boolean[n+1];
        dfs(s, e, 0);
		System.out.print(ans);
	}

	static void dfs(int s, int e, int d) {
        if (s == e) ans = d;
		visited[s] = true;
		for (int next : edge[s]) {
			if (!visited[next]) {
				dfs(next, e, d+1);
			}
		}
	}
}