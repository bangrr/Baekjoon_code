import java.io.*;
import java.util.*;

public class Bj_5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                char ch = st.nextToken().charAt(0);
                if (ch == '@') {
                    a *= 3;
                } else if (ch == '%') {
                    a += 5;
                } else if (ch == '#') {
                    a -= 7;
                } else {
                    throw new RuntimeException();
                }
            }
            sb.append(String.format("%.2f", a)).append("\n");
        }
        System.out.print(sb);
    }
}
