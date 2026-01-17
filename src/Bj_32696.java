import java.io.*;
import java.util.*;

public class Bj_32696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a != 0) {
            if (a == 1) {
                sb.append("x");
            } else if (a == -1) {
                sb.append("-x");
            } else {
                sb.append(a).append("x");
            }
        }
        if (b > 0) {
            if (sb.length() != 0) {
                sb.append("+");
            }
            sb.append(b);
        } else if (b < 0) {
            sb.append(b);
        } else {
            if (sb.length() == 0) {
                sb.append("0");
            }
        }
        System.out.print(sb);
    }
}