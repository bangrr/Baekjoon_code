import java.io.*;
import java.util.*;

public class Bj_19535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for (int i = 1; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        long dt = 0, gt = 0;
        boolean[] visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            long a = adj[i].size();
            if (a >= 3) {
                gt = gt + a*(a-1)*(a-2)/6;
            }
            visited[i] = true;
            for (int next : adj[i]) {
                long b = adj[next].size();
                if (!visited[next]) {
                    dt += (a-1)*(b-1);
                }
            }
        }

        if (dt > gt * 3) {
            System.out.print("D");
        } else if (dt < gt * 3) {
            System.out.print("G");
        } else {
            System.out.print("DUDUDUNGA");
        }
    }
}