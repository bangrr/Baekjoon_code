import java.io.*;
import java.util.*;

public class Bj_34099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (k == 1) {
                if (n < 4) {
                    sb.append("-1\n");
                } else {
                    for (int i=2; i<=n; i+=2) {
                        sb.append(i).append(" ");
                    }
                    for (int i=1; i<=n; i+=2) {
                        sb.append(i).append(" ");
                    }
                    sb.append("\n");
                }
            } else {
                for (int i=1; i<=n; i++) {
                    sb.append(i).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}