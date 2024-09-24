import java.io.*;
import java.util.*;

public class Bj_32279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(br.readLine());
        int sum = arr[1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = ( p * arr[i / 2] + q);
            } else {
                arr[i] = ( r * arr[i/2] + s);
            }
            sum += arr[i];
        }
        System.out.print(sum);
    }
}