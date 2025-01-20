import java.io.*;
import java.util.*;

public class Bj_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] tarr = new int[n];
        int[] parr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            tarr[i] = Integer.parseInt(st.nextToken());
            parr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i + tarr[i] <= n) {
                dp[i + tarr[i]] = Math.max(dp[i + tarr[i]], dp[i] + parr[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        System.out.print(dp[n]);
    }
}
