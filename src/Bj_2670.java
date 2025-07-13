import java.io.*;

public class Bj_2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] dp = new double[n+1];
        dp[0] = 1;
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            double x = Double.parseDouble(br.readLine());
            dp[i] = Math.max(x, x * dp[i - 1]);
            ans = Math.max(ans, dp[i]);
        }
        System.out.printf("%.3f", ans);
    }
}