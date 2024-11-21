import java.io.*;
import java.util.*;

public class Bj_11049 {
    static int[] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i+1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        System.out.print(recur(0, n-1));
    }

    private static int recur(int a, int b) {
        if (a == b) return 0;
        if (dp[a][b] != Integer.MAX_VALUE) return dp[a][b];

        for (int i = a; i < b; i++) {
            int val = recur(a, i) + recur(i + 1, b) + (arr[a] * arr[i + 1] * arr[b + 1]);
            dp[a][b] = Math.min(val, dp[a][b]);
        }

        return dp[a][b];
    }
}