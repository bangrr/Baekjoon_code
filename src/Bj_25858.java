import java.io.*;
import java.util.*;

public class Bj_25858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int s = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            s += a[i];
        }
        for (int i = 0; i < n; i++) {
            sb.append(d/s*a[i]).append("\n");
        }
        System.out.print(sb);
    }
}