import java.io.*;
import java.util.*;

public class Bj_5427 {
    private static class Pos {
        int r, c;

        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // 변수선언부
    static int R, C;
    static char[][] board;
    static int[][] time;
    static Queue<Pos> jq, fq;
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};

    // main 메소드
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input();
        }
        System.out.print(sb);
    }

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        time = new int[R][C];
        jq = new LinkedList<>();
        fq = new LinkedList<>();

        for (int r=0; r<R; r++) {
            String str = br.readLine();
            for (int c=0; c<C; c++) {
                char ch = str.charAt(c);
                board[r][c] = ch;
                if (ch == '@') {
                    jq.add(new Pos(r, c));
                }
                if (ch == '*') {
                    fq.add(new Pos(r, c));
                }
            }
        }
        BFS();
    }

    // 문제해결
    static void BFS() {
        while (!fq.isEmpty()) {
            Pos fCur = fq.poll();
            for (int i=0; i<4; i++) {
                int fnr = fCur.r + dr[i];
                int fnc = fCur.c + dc[i];
                int ft = time[fCur.r][fCur.c]+1;
                if (fnr < 0 || fnr >= R || fnc < 0 || fnc >= C) {
                    continue;
                }
                if (board[fnr][fnc] == '.' && time[fnr][fnc] == 0) {
                    time[fnr][fnc] = ft;
                    fq.add(new Pos(fnr, fnc));
                }
            }
        }
        while (!jq.isEmpty()) {
            Pos jCur = jq.poll();
            for (int i=0; i<4; i++) {
                int jnr = jCur.r + dr[i];
                int jnc = jCur.c + dc[i];
                int jt = time[jCur.r][jCur.c]+1;
                if (jnr < 0 || jnr >= R || jnc < 0 || jnc >= C) {
                    sb.append(jt).append("\n");
                    return;
                }
                if (board[jnr][jnc] == '.' && time[jnr][jnc] == 0 || time[jnr][jnc] > jt) {
                    board[jnr][jnc] = '@';
                    time[jnr][jnc] = jt;
                    jq.add(new Pos(jnr, jnc));
                }
            }
        }
        sb.append("IMPOSSIBLE\n");
    }
}
