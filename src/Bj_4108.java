import java.io.*;
import java.util.*;

public class Bj_4108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] dr = {0, -1, -1, -1, 0, 1, 1, 1};
        int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};

        while (true) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (r == 0 && c == 0) {
                break;
            }
            char[][] arr = new char[r][c];
            for (int i = 0; i < r; i++) {
                arr[i] = br.readLine().toCharArray();
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == '.') {
                        int cnt = 0;
                        for (int k = 0; k < 8; k++) {
                            int nr = i + dr[k];
                            int nc = j + dc[k];
                            if (nr >= 0 && nr < r && nc >= 0 && nc < c && arr[nr][nc] == '*') {
                                cnt++;
                            }
                        }
                        arr[i][j] = (char) (cnt + '0');
                    }
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sb.append(arr[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}