import java.io.*;
import java.util.*;

public class Bj_2823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] arr = new char[r + 2][c + 2];

        for (int i = 1; i <= r; i++) {
            String s = br.readLine();
            for (int j = 1; j <= c; j++) {
                arr[i][j] = s.charAt(j - 1);
            }
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (arr[i][j] != '.') continue;

                int cnt = 0;
                if (arr[i - 1][j] != '.') {
                    cnt++;
                }
                if (arr[i + 1][j] != '.') {
                    cnt++;
                }
                if (arr[i][j - 1] != '.') {
                    cnt++;
                }
                if (arr[i][j + 1] != '.') {
                    cnt++;
                }
                if (cnt > 2) {
                    System.out.print(1);
                    return;
                }
            }
        }
        System.out.print(0);
    }
}