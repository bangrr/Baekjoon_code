import java.util.*;
import java.io.*;

public class Bj_1753 {
    static class Pair {
        int v, w;

        public Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    static final int IMAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int V = rd.nextInt();
        int E = rd.nextInt();
        int K = rd.nextInt();

        ArrayList<Pair>[] adj = new ArrayList[V+1];
        for (int i=1; i<=V; i++) {
            adj[i] = new ArrayList<>();
        }

        while (E-- > 0) {
            int u = rd.nextInt();
            int v = rd.nextInt();
            int w = rd.nextInt();
            adj[u].add(new Pair(v, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Pair(K, 0));

        int[] mt = new int[V+1];
        Arrays.fill(mt, IMAX);
        mt[K] = 0;

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            if (mt[cur.v] == cur.w) {
                for (Pair next : adj[cur.v]) {
                    if (mt[next.v] > mt[cur.v] + next.w) {
                        mt[next.v] = mt[cur.v] + next.w;
                        pq.add(new Pair(next.v, mt[next.v]));
                    }
                }
            }
        }

        for (int i=1; i<=V; i++) {
            if (mt[i] == IMAX) {
                sb.append("INF\n");
            } else {
                sb.append(mt[i]).append("\n");
            }
        }
        System.out.print(sb);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
