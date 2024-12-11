import java.io.*;
import java.util.*;

public class Bj_22986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long a = n * (n + 1) / 2 * 4;
            long b = k <= n ? (n - k - 1) * (n - k) / 2 * 4 : 0;
            sb.append(Math.max(a - b, 0)).append("\n");
        }
        System.out.print(sb);
    }
}
