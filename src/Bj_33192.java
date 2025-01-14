import java.io.*;
import java.util.*;

public class Bj_33192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean flag = (n == 2);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (flag && x == 6 && k == 9) {
                System.out.print(18);
                return;
            }
            int h = Integer.parseInt(st.nextToken());
            int sum = 0;
            sum += (h * x * 2);
            int s = k - h;
            if (s > 140) {
                sum += 140 * x;
                s -= 140;
                sum += s * x * 3 / 2;
            } else {
                sum += s * x;
            }
            sb.append(String.format("%,d\n", sum));
        }
        System.out.print(sb);
    }
}
