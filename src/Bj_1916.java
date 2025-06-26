import java.util.*;
import java.io.*;

public class Bj_1916 {
    private static class Pair {
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

        // 도시의 개수 N, 버스의 개수 M 입력
        int N = rd.nextInt();
        int M = rd.nextInt();

        // 인접리스트 초기화
        ArrayList<Pair>[] adj = new ArrayList[N+1];
        for (int i=1; i<=N; i++) {
            adj[i] = new ArrayList<>();
        }

        // A to B 의 가중치 W 저장
        while (M-- > 0) {
            int A = rd.nextInt();
            int B = rd.nextInt();
            int W = rd.nextInt();
            adj[A].add(new Pair(B, W));
        }

        // 출발점 S, 도착점 E 입력
        int S = rd.nextInt();
        int E = rd.nextInt();

        // dijkstra를 위한 준비
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Pair(S, 0));

        int[] dist = new int[N+1];
        Arrays.fill(dist, IMAX);
        dist[S] = 0;

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            if (cur.v == E) {
                System.out.print(cur.w);
                return;
            }
            if (dist[cur.v] == cur.w) {
                for (Pair next : adj[cur.v]) {
                    if (dist[next.v] > dist[cur.v] + next.w) {
                        dist[next.v] = dist[cur.v] + next.w;
                        pq.add(new Pair(next.v, dist[next.v]));
                    }
                }
            }
        }
    }

    private static class FastReader {
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
