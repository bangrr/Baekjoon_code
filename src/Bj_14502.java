import java.io.*;
import java.util.*;

public class Bj_14502 {
    static int n, m, ans;
    static int[][] arr;

    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        makeWall(0);
        System.out.print(ans);
    }

    private static void makeWall(int cnt) {
        if (cnt == 3) {
            spreadVirus();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    makeWall(cnt+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void spreadVirus() {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        int[][] tmpArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            tmpArr[i] = arr[i].clone();
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dr[i];
                int nx = x + dc[i];

                if (0 <= ny && ny < n && 0 <= nx && nx < m) {
                    if (tmpArr[ny][nx] == 0) {
                        q.add(new int[]{ny, nx});
                        tmpArr[ny][nx] = 2;
                    }
                }
            }
        }

        cntSafeZone(tmpArr);
    }

    private static void cntSafeZone(int[][] tmpArr) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tmpArr[i][j] == 0) {
                    cnt++;
                }
            }
        }
        ans = Math.max(ans, cnt);
    }
}
