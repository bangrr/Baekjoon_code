import java.io.*;
import java.util.*;

public class Bj_14471 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[i] = Math.max(0, b-n);
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < m-1; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}