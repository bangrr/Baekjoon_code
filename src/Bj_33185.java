import java.io.*;
import java.util.*;

public class Bj_33185 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = s.charAt(j-1);
            }
        }
        int[][] dp = new int[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int ul = dp[i-1][j-1];
                if (arr[i-1][j-1] == 'B') {
                    ul++;
                } else if (arr[i-1][j-1] == 'W') {
                    ul = 0;
                }
                int u = dp[i-1][j];
                if (arr[i-1][j] == 'B') {
                    u++;
                } else if (arr[i-1][j] == 'W') {
                    u = 0;
                }
                int ur = dp[i-1][j+1];
                if (arr[i-1][j+1] == 'B') {
                    ur++;
                } else if (arr[i-1][j+1] == 'W') {
                    ur = 0;
            }
                dp[i][j] = Math.max(ul, Math.max(u, ur));
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == 'W') {
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        System.out.print(ans);
    }
}
