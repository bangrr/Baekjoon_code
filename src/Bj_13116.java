import java.io.*;
import java.util.*;

public class Bj_13116 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            boolean[] arr = new boolean[1024];
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while (a >= 1) {
                arr[a] = true;
                a /= 2;
            }
            while (b >= 1) {
                if (arr[b]) {
                    sb.append(b * 10).append("\n");
                    break;
                }
                arr[b] = true;
                b /= 2;
            }
        }
        System.out.print(sb);
    }
}