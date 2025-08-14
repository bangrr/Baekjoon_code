import java.io.*;
import java.util.*;

public class Bj_4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (b == 0 && n == 0) {
                break;
            }

            int min = 1000000;
            int ans = 0;
            for (int i=1; i<=1000000; i++) {
                if ((int) Math.pow(i, n) > 2000000) {
                    continue;
                }

                int res = Math.abs((int) Math.pow(i, n) - b);
                if (min > res) {
                    min = res;
                    ans = i;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}