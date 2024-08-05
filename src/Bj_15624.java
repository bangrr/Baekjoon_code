import java.io.*;

public class Bj_15624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MOD = 1000000007;

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[Math.max(3, n+1)];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<=n; i++) {
            br.read();
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        System.out.print(dp[n] % MOD);
    }
}