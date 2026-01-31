import java.io.*;
import java.util.*;

public class Bj_5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            sb.append("Distances: ");
            for (int i = 0; i < a.length(); i++) {
                char ca = a.charAt(i);
                char cb = b.charAt(i);
                if (ca <= cb) {
                    sb.append(cb-ca);
                } else {
                    sb.append(cb-ca+26);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}