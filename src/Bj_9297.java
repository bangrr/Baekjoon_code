import java.io.*;
import java.util.*;

public class Bj_9297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            sb.append("Case ").append(i).append(": ");
            if (n / d == 0 && n % d == 0) {
                sb.append(0).append("\n");
            } else {
                if (n / d > 0) {
                    sb.append(n / d).append(" ");
                }
                if (n % d > 0) {
                    sb.append(n % d).append("/").append(d);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}