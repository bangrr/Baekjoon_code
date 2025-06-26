import java.util.*;
import java.io.*;

public class Bj_2780 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int MOD = 1234567;
        int[][] dp = new int[1001][10];
        Arrays.fill(dp[1], 1);

        for (int i = 2; i <= 1000; i++) {
            dp[i][0] = dp[i-1][7] % MOD;
            dp[i][1] = (dp[i-1][2] + dp[i-1][4]) % MOD;
            dp[i][2] = (dp[i-1][1] + dp[i-1][3] + dp[i-1][5]) % MOD;
            dp[i][3] = (dp[i-1][2] + dp[i-1][6]) % MOD;
            dp[i][4] = (dp[i-1][1] + dp[i-1][5] + dp[i-1][7]) % MOD;
            dp[i][5] = (dp[i-1][2] + dp[i-1][4] + dp[i-1][6] + dp[i-1][8]) % MOD;
            dp[i][6] = (dp[i-1][3] + dp[i-1][5] + dp[i-1][9]) % MOD;
            dp[i][7] = (dp[i-1][4] + dp[i-1][8] + dp[i-1][0]) % MOD;
            dp[i][8] = (dp[i-1][5] + dp[i-1][7] + dp[i-1][9]) % MOD;
            dp[i][9] = (dp[i-1][6] + dp[i-1][8]) % MOD;
        }

        int t = rd.nextInt();
        while (t-- > 0) {
            int n = rd.nextInt();
            int ans = 0;
            for (int i = 0; i < 10; i++) {
                ans += dp[n][i];
            }
            sb.append(ans % MOD).append("\n");
        }
        System.out.print(sb);
    }

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}