import java.util.*;
import java.io.*;

public class Bj_17114 {
    static int m, n, o, p, q, r, s, t, u, v, w, cnt, ans;
    static int[][][][][][][][][][][] boxes;
    static int[] mm = {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] nn = {0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] oo = {0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] pp = {0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] qq = {0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] rr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] ss = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] tt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0};
    static int[] uu = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0};
    static int[] vv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0};
    static int[] ww = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1};
    static Queue<Pos> queue = new LinkedList<>();

    private static class Pos {
        int a, b, c, d, e, f, g, h, i, j, k, day;

        public Pos(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int day) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        o = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        boxes = new int[m][n][o][p][q][r][s][t][u][v][w];
        for (int k = 0; k < w; k++) {
            for (int j = 0; j < v; j++) {
                for (int i = 0; i < u; i++) {
                    for (int h = 0; h < t; h++) {
                        for (int g = 0; g < s; g++) {
                            for (int f = 0; f < r; f++) {
                                for (int e = 0; e < q; e++) {
                                    for (int d = 0; d < p; d++) {
                                        for (int c = 0; c < o; c++) {
                                            for (int b = 0; b < n; b++) {
                                                st = new StringTokenizer(br.readLine());
                                                for (int a = 0; a < m; a++) {
                                                    boxes[a][b][c][d][e][f][g][h][i][j][k] = Integer.parseInt(st.nextToken());
                                                    if (boxes[a][b][c][d][e][f][g][h][i][j][k] == 0) cnt++;
                                                    if (boxes[a][b][c][d][e][f][g][h][i][j][k] == 1) queue.add(new Pos(a, b, c, d, e, f, g, h, i, j, k, 0));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bfs();
        System.out.print(cnt == 0 ? ans : -1);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            if (cnt == 0) break;
            for (int z=0; z<22; z++) {
                int a = cur.a + mm[z];
                int b = cur.b + nn[z];
                int c = cur.c + oo[z];
                int d = cur.d + pp[z];
                int e = cur.e + qq[z];
                int f = cur.f + rr[z];
                int g = cur.g + ss[z];
                int h = cur.h + tt[z];
                int i = cur.i + uu[z];
                int j = cur.j + vv[z];
                int k = cur.k + ww[z];

                if (a >= m || a < 0 || b >= n || b < 0 || c >= o || c < 0 || d >= p || d < 0 || e >= q || e < 0 || f >= r || f < 0 || g >= s || g < 0 || h >= t || h < 0 || i >= u || i < 0 || j >= v || j < 0 || k >= w || k < 0) continue;
                if (boxes[a][b][c][d][e][f][g][h][i][j][k] != 0) continue;
                boxes[a][b][c][d][e][f][g][h][i][j][k] = 1;
                cnt--;
                ans = cur.day + 1;
                queue.add(new Pos(a, b, c, d, e, f, g, h, i, j, k, ans));
            }
        }
    }
}