import java.io.*;
import java.util.*;

public class Bj_2623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] deg = new int[n + 1];
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            while (--k > 0) {
                int b = Integer.parseInt(st.nextToken());
                adj[a].add(b);
                deg[b]++;
                a = b;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (deg[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append("\n");
            for (int next : adj[cur]) {
                deg[next]--;
                if (deg[next] == 0) q.add(next);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (deg[i] > 0) {
                sb.setLength(0);
                break;
            }
        }
        System.out.print(sb.length() == 0 ? 0 : sb);
    }
}