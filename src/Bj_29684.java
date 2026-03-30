import java.io.*;
import java.util.*;

public class Bj_29684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int min = 10000;
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int a = Integer.parseInt(st.nextToken());
                int b = Math.abs(2023 - a);
                if (b < min) {
                    min = b;
                    ans = i;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}