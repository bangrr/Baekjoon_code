import java.io.*;
import java.util.*;

public class Bj_9184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][][] w = new int[21][21][21];
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                for (int k = 0; k <= 20; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        w[i][j][k] = 1;
                    } else if (i < j && j < k) {
                        w[i][j][k] = w[i][j][k - 1] + w[i][j - 1][k - 1] - w[i][j - 1][k];
                    } else {
                        w[i][j][k] = w[i - 1][j][k] + w[i - 1][j - 1][k] + w[i - 1][j][k - 1] - w[i - 1][j - 1][k - 1];
                    }
                }
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            int ans;
            if (a <= 0 || b <= 0 || c <= 0) {
                ans = 1;
            } else if (a > 20 || b > 20 || c > 20) {
                ans = w[20][20][20];
            } else {
                ans = w[a][b][c];
            }
            sb.append(String.format("w(%d, %d, %d) = %d\n", a, b, c, ans));
        }
        System.out.print(sb);
    }
}