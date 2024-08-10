import java.io.*;
import java.util.*;

public class Bj_2711 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int i=1; i<=s.length(); i++) {
                if (i!=n) sb.append(s.charAt(i-1));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}