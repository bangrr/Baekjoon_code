import java.io.*;
import java.util.*;

public class Bj_14503 {
    // 0, 1, 2, 3 순서대로 북 동 남 서
    static int[] DR = {-1, 0, 1, 0};
    static int[] DC = {0, 1, 0, -1};

    static class Robot {
        int r, c, d;

        public Robot(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Robot v = new Robot(r, c, d);

        int[][] room = new int[n][m]; // 0은 빈칸, 1은 벽
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        while (true) {
            // 현재 위치 확인
            if (room[v.r][v.c] == 0) { // 청소되지 않은 경우
                room[v.r][v.c] = -1; // 현재 칸을 청소
                ans++;
            }

            int cnt = 0;
            if (room[v.r-1][v.c] != 0 && room[v.r][v.c-1] != 0 && room[v.r+1][v.c] != 0 && room[v.r][v.c+1] != 0) {
                v.r = v.r-DR[v.d];
                v.c = v.c-DC[v.d];
                if (room[v.r][v.c] == 1) break;
            }
            for (int i=0; i<4; i++) {
                v.d = (v.d + 3) % 4; // 주어진 순서는 시계방향인데 반시계로 돌리려면 d = (v.d + 3) % 4
                int nr = v.r + DR[v.d];
                int nc = v.c + DC[v.d];
                if (room[nr][nc] == 0) {
                    v.r = nr;
                    v.c = nc;
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}
