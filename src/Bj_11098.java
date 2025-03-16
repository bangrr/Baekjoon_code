import java.io.*;
import java.util.*;

public class Bj_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int p = Integer.parseInt(br.readLine());
            int m = 0;
            String a = null;
            while (p-- > 0) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                String s = st.nextToken();
                if (m < c) {
                    m = c;
                    a = s;
                }
            }
            sb.append(a).append("\n");
        }
        System.out.print(sb);
    }
}