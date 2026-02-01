import java.io.*;
import java.util.*;

public class Bj_5356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    sb.append(c);
                }
                sb.append("\n");
                c = c + 1 > 'Z' ? 'A' : (char) (c + 1);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}