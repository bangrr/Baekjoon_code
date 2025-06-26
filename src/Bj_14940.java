import java.util.*;
import java.io.*;

public class Bj_14940 {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, -1, 0, 1};
    static private class Pos {
        int r, c, dist;

        public Pos(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = rd.nextInt(); //세로크기
        int m = rd.nextInt(); //가로크기
        int[][] board = new int[n][m];
        boolean[][] checked = new boolean[n][m];
        Queue<Pos> q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                board[i][j] = rd.nextInt();
                if (board[i][j] == 2) {
                    checked[i][j] = true;
                    board[i][j] = 0;
                    q.add(new Pos(i, j, board[i][j]));
                }
            }
        }

        while (!q.isEmpty()) {
            Pos cur = q.poll();
            for (int i=0; i<4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (board[nr][nc] == 0 || checked[nr][nc]) continue;
                checked[nr][nc] = true;
                board[nr][nc] = cur.dist+1;
                q.add(new Pos(nr, nc, board[nr][nc]));
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (!checked[i][j] && board[i][j] == 1) {
                    sb.append(-1);
                } else {
                    sb.append(board[i][j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
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