import java.io.*;
import java.util.*;

public class Bj_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];

        int len = 1;
        for (int i = 1; i < n; i++) {

            int cur = arr[i];

            if (dp[len - 1] < cur) {
                len++;
                dp[len - 1] = cur;
            } else {
                int lo = 0;
                int hi = len - 1;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;

                    if (dp[mid] < cur) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                dp[lo] = cur;
            }
        }
        System.out.print(len);
    }
}