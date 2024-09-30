import java.io.*;
import java.util.*;

public class Bj_25822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double c = Double.parseDouble(br.readLine());
        int sf = Math.min((int)(c / 0.99), 2);

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][3];
        int ans = 0;
        int hi = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int a = Integer.parseInt(st.nextToken());
            hi = Math.max(hi, a);
            if (a == 0) {
                dp[i][0] = 0;
                dp[i][1] = dp[i-1][0] + 1;
                dp[i][2] = dp[i-1][1] + 1;
            } else {
                dp[i][0] = dp[i-1][0] + 1;
                dp[i][1] = dp[i-1][1] + 1;
                dp[i][2] = dp[i-1][2] + 1;
            }
            ans = Math.max(ans, dp[i][sf]);
        }
        System.out.println(ans);
        System.out.print(hi);
    }
}