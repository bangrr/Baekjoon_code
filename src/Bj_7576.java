import java.util.*;
import java.io.*;

public class Bj_7576 {
    static int n, m, cnt, ans;
    static int[][] boxes;
    static int[] DR = {-1, 0, 1, 0};
    static int[] DC = {0, -1, 0, 1};
    static Queue<Pos> q = new LinkedList<>();

    private static class Pos {
        int r, c, day;

        public Pos(int r, int c, int day) {
            this.r = r;
            this.c = c;
            this.day = day;
        }
    }

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        m = rd.nextInt(); // 가로 칸 수
        n = rd.nextInt(); // 세로 칸 수
        boxes = new int[n+1][m+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                boxes[i][j] = rd.nextInt();
                if (boxes[i][j] == 0) cnt++;
                if (boxes[i][j] == 1) q.add(new Pos(i, j, 0));
            }
        }
        bfs();
        System.out.print(cnt == 0 ? ans : -1);
    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Pos cur = q.poll();
            if (cnt == 0) break;
            for (int i=0; i<4; i++) {
                int nr = cur.r + DR[i];
                int nc = cur.c + DC[i];

                if (nr > n || nr <= 0 || nc > m || nc <= 0) continue;
                if (boxes[nr][nc] != 0) continue;
                boxes[nr][nc] = 1;
                cnt--;
                ans = cur.day + 1;
                q.add(new Pos(nr, nc, ans));
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