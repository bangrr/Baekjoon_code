import java.io.*;
import java.util.*;

public class Bj_11149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int sum = 0;
                String s = st.nextToken();
                for (int i = 0; i < s.length(); i++) {
                    sum += (s.charAt(i) - 'a');
                }
                int ch = sum % 27;
                sb.append(ch == 26 ? " " : (char)(ch + 'a'));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}