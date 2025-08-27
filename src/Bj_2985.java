import java.io.*;
import java.util.*;

public class Bj_2985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a + b == c) {
            sb.append(a).append("+").append(b).append("=").append(c);
        } else if (a - b == c) {
            sb.append(a).append("-").append(b).append("=").append(c);
        } else if (a * b == c) {
            sb.append(a).append("*").append(b).append("=").append(c);
        } else if (a % b == 0 && a / b == c) {
            sb.append(a).append("/").append(b).append("=").append(c);
        } else if (a == b + c) {
            sb.append(a).append("=").append(b).append("+").append(c);
        } else if (a == b - c) {
            sb.append(a).append("=").append(b).append("-").append(c);
        } else if (a == b * c) {
            sb.append(a).append("=").append(b).append("*").append(c);
        } else if (b % c == 0 && a == b / c) {
            sb.append(a).append("=").append(b).append("/").append(c);
        }
        System.out.print(sb);
    }
}