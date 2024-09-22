import java.io.*;
import java.util.*;

public class Bj_32298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m * 2 + m * (n - 1) > 2000000) {
            sb.append(-1);
        } else {
            for (int i = m * 2; i <= m * 2 + m * (n - 1); i += m) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}