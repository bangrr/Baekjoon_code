import java.io.*;
import java.util.*;

public class Bj_28115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                int tmp = arr[i] - arr[i-1];
                if (i == 1) {
                    sum = tmp;
                }
                if (sum != tmp) {
                    System.out.print("NO");
                    return;
                }
            }
        }
        sb.append("YES\n");
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(0).append(" ");
            sc.append(arr[i]).append(" ");
        }
        System.out.println(sb);
        System.out.print(sc);
    }
}