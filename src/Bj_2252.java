import java.util.*;
import java.io.*;

public class Bj_2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] deg = new int[n+1];
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            deg[b]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            if (deg[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append(" ");
            for (int next : adj[cur]) {
                deg[next]--;
                if (deg[next] == 0) q.add(next);
            }
        }
        System.out.print(sb);
    }
}