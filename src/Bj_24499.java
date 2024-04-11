import java.io.*;
import java.util.*;

public class Bj_24499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n*2+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i+n] = arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i=1; i<=k; i++) { // 처음 k개 합
            sum += arr[i];
        }
        int ans = sum;
        for (int i=2; i<=n*2; i++) {
            if (i>n) break;
            sum = sum - arr[i-1] + arr[i+k-1];
            ans = Math.max(ans, sum);
        }
        System.out.print(ans);
    }
}