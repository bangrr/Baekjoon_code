import java.io.*;
import java.util.*;

public class Bj_14397 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = arr[i][j];
                if (c == '#') {
                    ans += checkAround(arr, i, j);
                }
            }
        }
        System.out.print(ans);
    }

    private static int checkAround(char[][] arr, int row, int col) {
        int cnt = 0;

        int[] dx = {1, 0, -1, -1, -1, 0,
                1, 1, 0, -1, 0, 1};
        int[] dy = {0, 1, 1, 0, -1, -1};

        for (int i = 0; i < 6; i++) {
            int ny = row + dy[i];
            int nx = col + (row % 2 == 0 ? dx[i] : dx[i+6]);
            if (nx < 0 || nx >= arr[0].length || ny < 0 || ny >= arr.length) continue;
            if (arr[ny][nx] != '.') continue;
            cnt++;
        }
        return cnt;
    }
}