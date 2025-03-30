import java.io.*;
import java.util.*;

public class Bj_23827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        long[] sum = new long[n+1];
        st = new StringTokenizer(br.readLine());
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];

            ans += sum[i-1] * arr[i];
            ans %= 1000000007;
        }
        System.out.print(ans);
    }
}