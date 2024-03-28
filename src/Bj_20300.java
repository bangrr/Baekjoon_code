import java.io.*;
import java.util.*;

public class Bj_20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        long max = 0;
        if (n % 2 == 0) {
            for (int i=0; i<n/2; i++) {
                max = Math.max(max, (arr[i]+arr[n-1-i]));
            }
        }
        else {
            for (int i=0; i<n/2; i++) {
                max = Math.max(max, (arr[i]+arr[n-2-i]));
            }
            max = Math.max(max, arr[n-1]);
        }
        System.out.print(max);
    }
}