import java.io.*;
import java.util.*;

public class Bj_17404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][3];
        int[][] dp = new int[n+1][3];
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 3; i++) {
                if (i==k) dp[1][i] = arr[1][i];
                else dp[1][i] = 2222;
            }

            for (int i = 2; i <= n; i++) {
                dp[i][0] = arr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
                dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
                dp[i][2] = arr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
            }

            for (int i = 0; i < 3; i++) {
                if (i == k) continue;
                ans = Math.min(ans, dp[n][i]);
            }
        }
        System.out.print(ans);
    }
}