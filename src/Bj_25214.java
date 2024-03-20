import java.util.*;
import java.io.*;

public class Bj_25214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int min = 1234567890;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
            dp[i] = Math.max(dp[i-1], arr[i]-min);
            sb.append(dp[i]).append(" ");
        }
        System.out.print(sb);
    }
}