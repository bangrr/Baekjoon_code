import java.io.*;
import java.util.*;

public class Bj_15786 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        for (int i = 0; i < m; i++) {
            int p = 0;
            String t = br.readLine();
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(p)) {
                    p++;
                }
                if (p == n) {
                    break;
                }
            }
            if (p == n) {
                sb.append("true\n");
            } else {
                sb.append("false\n");
            }
        }
        System.out.print(sb);
    }
}