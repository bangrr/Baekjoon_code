import java.io.*;
import java.util.*;

public class Bj_3952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            int p = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                p += arr[i];
                while (p < 0) p += s.length();
                p %= s.length();
                sb.append(s.charAt(p));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}