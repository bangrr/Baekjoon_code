import java.io.*;
import java.util.*;

public class Bj_4097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int sum = 0;
            int ans = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                sum += Integer.parseInt(st.nextToken());
                ans = Math.max(ans, sum);

                if (sum < 0) sum = 0;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}