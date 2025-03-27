import java.io.*;
import java.util.*;

public class Bj_13900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        long[] sum = new long[n + 1];
        long ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + arr[i];
        }
        for (int i = n; i >= 1; i--) {
            ans += sum[i - 1] * arr[i];
        }
        System.out.print(ans);
    }
}