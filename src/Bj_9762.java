import java.io.*;
import java.util.*;

public class Bj_9762 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            int sum = 0;

            st = new StringTokenizer(br.readLine());
            for (int i=(n+1)/2; i<=n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            for (int i=n/2; i>=1; i--) {
                int min = Math.min(arr[i*2], arr[i*2+1]);
                arr[i*2] -= min;
                arr[i*2+1] -= min;
                arr[i] += min;
                sum = sum - min;
            }

            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}