import java.io.*;
import java.util.*;

public class Bj_4803 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int caseCnt = 0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }

            List<Integer>[] adj = new List[n + 1];
            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }
            boolean[] visited = new boolean[n + 1];

            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                adj[a].add(b);
                adj[b].add(a);
            }

            int treeCnt = 0;
            int chkTree = 1;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    if (dfs(i, -1, chkTree, adj, visited)) treeCnt++;
                }
            }

            sb.append("Case ").append(++caseCnt).append(": ");
            if (treeCnt == 0) {
                sb.append("No trees.\n");
            } else if (treeCnt == 1) {
                sb.append("There is one tree.\n");
            } else {
                sb.append("A forest of ").append(treeCnt).append(" trees.\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean dfs(int cur, int prev, int chkTree, List<Integer>[] adj, boolean[] visited) {
        for (int next : adj[cur]) {
            if (next == prev) {
                continue;
            }
            if (visited[next]) {
                return false;
            }
            visited[next] = true;
            if (!dfs(next, cur, chkTree, adj, visited)) return false;
        }
        return true;
    }
}
