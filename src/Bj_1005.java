import java.io.*;
import java.util.*;

public class Bj_1005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] deg = new int[n + 1];
            ArrayList<Integer>[] adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }

            while (k-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                adj[x].add(y);
                deg[y]++;
            }
            int w = Integer.parseInt(br.readLine());

            Queue<Integer> q = new PriorityQueue<>();
            int[] dp = new int[n + 1];
            for (int i=1; i<=n; i++) {
                dp[i] = arr[i];
                if (deg[i] == 0) q.add(i);
            }

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : adj[cur]) {
                    dp[next] = Math.max(dp[next], dp[cur] + arr[next]);
                    deg[next]--;
                    if (deg[next] == 0) q.add(next);
                }
            }
            sb.append(dp[w]).append("\n");
        }
        System.out.print(sb);
    }
}