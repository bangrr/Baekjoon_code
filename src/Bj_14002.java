import java.io.*;
import java.util.*;

public class Bj_14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        System.out.println(max);
        int[] print = new int[max];
        int p = max;
        for (int i = n; i > 0; i--) {
            if (dp[i] == p) {
                print[p - 1] = arr[i];
                p--;
            }
        }
        for (int it : print) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}