import java.io.*;
import java.util.*;

public class Bj_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) arr[0][i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) arr[1][i] = Integer.parseInt(st.nextToken());
            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            for (int i = 2; i <= n; i++) {
                dp[0][i] = Math.max(dp[1][i-1], Math.max(dp[1][i-2], dp[0][i-2])) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i-1], Math.max(dp[0][i-2], dp[1][i-2])) + arr[1][i];
            }
            sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
        }
        System.out.print(sb);
    }
}