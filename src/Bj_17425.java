import java.io.*;
import java.util.*;

public class Bj_17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = 1000001;
        long[] arr = new long[max];
        Arrays.fill(arr, 1);
        for (int i=2; i<max; i++) {
            for (int j=1; i*j<max; j++) {
                arr[i*j] += i;
            }
        }

        long[] sum = new long[max];
        for (int i = 1; i < max; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(sum[n]).append("\n");
        }
        System.out.print(sb);
    }
}