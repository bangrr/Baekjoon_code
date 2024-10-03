import java.io.*;
import java.util.*;

public class Bj_14969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int ans = 0;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if (sum > m) continue;
                    ans = Math.max(ans, sum);
                }
            }
            sb.append(ans == 0 ? "NONE" : ans).append("\n");
        }
        System.out.print(sb);
    }
}