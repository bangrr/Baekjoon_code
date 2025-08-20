import java.io.*;
import java.util.*;

public class Bj_32529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            if (sum >= m) {
                sb.append(i+1).append("\n");
                break;
            }
        }
        System.out.print(sb.length() == 0 ? -1 : sb);
    }
}