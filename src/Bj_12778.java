import java.io.*;
import java.util.*;

public class Bj_12778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            if (c == 'C') {
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < m; i++) {
                    char ch = st.nextToken().charAt(0);
                    sb.append(ch - 'A' + 1).append(" ");
                }
            } else if (c == 'N') {
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < m; i++) {
                    int ch = Integer.parseInt(st.nextToken());
                    sb.append((char)('A' + ch - 1)).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}