import java.io.*;
import java.util.*;

public class Bj_33910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = 1234567;
        long sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += min;
        }
        System.out.print(sum);
    }
}