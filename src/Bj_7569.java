import java.util.*;
import java.io.*;

public class Bj_7569 {
    static int n, m, h, cnt, ans;
    static int[][][] boxes;
    static int[] DM = {-1, 0, 0, 1, 0, 0};
    static int[] DN = {0, -1, 0, 0, 1, 0};
    static int[] DH = {0, 0, -1, 0, 0, 1};
    static Queue<Pos> q = new LinkedList<>();

    private static class Pos {
        int ph, pr, pc, day;

        public Pos(int h, int r, int c, int day) {
            this.ph = h;
            this.pr = r;
            this.pc = c;
            this.day = day;
        }
    }

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        m = rd.nextInt(); // 가로 칸 수
        n = rd.nextInt(); // 세로 칸 수
        h = rd.nextInt(); // 높이
        boxes = new int[h+1][n+1][m+1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    boxes[i][j][k] = rd.nextInt();
                    if (boxes[i][j][k] == 0) cnt++;
                    if (boxes[i][j][k] == 1) q.add(new Pos(i, j, k, 0));
                }
            }
        }
        bfs();
        System.out.print(cnt == 0 ? ans : -1);
    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Pos cur = q.poll();
            if (cnt == 0) break;
            for (int i=0; i<6; i++) {
                int nh = cur.ph + DH[i];
                int nr = cur.pr + DM[i];
                int nc = cur.pc + DN[i];

                if (nh > h || nh <= 0 || nr > n || nr <= 0 || nc > m || nc <= 0) continue;
                if (boxes[nh][nr][nc] != 0) continue;
                boxes[nh][nr][nc] = 1;
                cnt--;
                ans = cur.day + 1;
                q.add(new Pos(nh, nr, nc, ans));
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