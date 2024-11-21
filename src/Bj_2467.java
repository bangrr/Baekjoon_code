import java.io.*;
import java.util.*;

public class Bj_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lim = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int lo = i + 1, hi = n - 1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                int sum = arr[i] + arr[mid];
                int abs = Math.abs(sum);
                if (abs < lim) {
                    lim = abs;
                    sb.setLength(0);
                    sb.append(arr[i]).append(" ").append(arr[mid]);
                }

                if (sum > 0) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        System.out.print(sb);
    }
}