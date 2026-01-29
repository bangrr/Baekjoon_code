import java.io.*;
import java.util.*;

public class Bj_3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1000];
        Arrays.fill(arr, 1000);
        while (n-- > 0) {
            int d = Integer.parseInt(br.readLine());
            for (int i = d; i > 0; i--) {
                arr[i] = Math.min(arr[i], d-i+1);
            }
            for (int i = d; i < 1000; i++) {
                arr[i] = Math.min(arr[i], i-d+1);
            }
        }
        System.out.print(Math.min(Math.abs(a-b), arr[b]));
    }
}