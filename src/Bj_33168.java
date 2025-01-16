import java.io.*;
import java.util.*;

public class Bj_33168 {
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

        int c = n;
        while (c-- > 0) {
            for (int i = 0; i < c; i++) {
                arr[i] = arr[i] + arr[i + 1];
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
