import java.io.*;
import java.util.*;

public class Bj_6322 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int i = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            sb.append(String.format("Triangle #%d\n", i));
            double res;
            if (a == -1) {
                if (c*c - b*b <= 0) {
                    sb.append("Impossible.\n");
                } else {
                    res = Math.sqrt(c*c - b*b);
                    sb.append(String.format("a = %.3f\n", res));
                }
            } else if (b == -1) {
                if (c*c - a*a <= 0) {
                    sb.append("Impossible.\n");
                } else {
                    res = Math.sqrt(c*c - a*a);
                    sb.append(String.format("b = %.3f\n", res));
                }
            } else if (c == -1) {
                res = Math.sqrt(a*a + b*b);
                sb.append(String.format("c = %.3f\n", res));
            }
            sb.append("\n");

            i++;
        }
        System.out.print(sb);
    }
}