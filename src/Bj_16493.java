import java.io.*;
import java.util.*;

public class Bj_16493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] chapters = new int[m+1][2];
        int[][] dp = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            chapters[i][0] = d;
            chapters[i][1] = p;
        }

        for (int i=1; i<=m; i++) {
            int d = chapters[i][0];
            int p = chapters[i][1];

            for (int j=1; j<=n; j++) {
                if ((j >= d)) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-d] + p);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.print(dp[m][n]);
    }
}