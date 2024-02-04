import java.util.*;
import java.io.*;

public class Bj_13549 {
    static class Pair {
        int v, w;

        public Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    static final int IMAX = Integer.MAX_VALUE;
    static final int NMAX = 200000;

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int N = rd.nextInt();
        int K = rd.nextInt();

        // 인접리스트 초기화
        ArrayList<Pair>[] adj = new ArrayList[NMAX+1];
        for (int i=0; i<=NMAX; i++) {
            adj[i] = new ArrayList<>();
        }

        // A to B 의 가중치 W 저장
        adj[0].add(new Pair(1, 1));
        for (int i=1; i<=NMAX; i++) {
            adj[i].add(new Pair(i-1, 1));
            adj[i].add(new Pair(i+1, 1));
            adj[i].add(new Pair(i*2, 0));
        }

        // dijkstra를 위한 준비
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Pair(N, 0));

        int[] dist = new int[NMAX+1];
        Arrays.fill(dist, IMAX);
        dist[N] = 0;

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            if (cur.v == K) {
                System.out.print(cur.w);
                return;
            }
            if (dist[cur.v] == cur.w) {
                for (Pair next : adj[cur.v]) {
                    if (next.v > 1<<17) continue;
                    if (dist[next.v] > dist[cur.v] + next.w) {
                        dist[next.v] = dist[cur.v] + next.w;
                        pq.add(new Pair(next.v, dist[next.v]));
                    }
                }
            }
        }
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
