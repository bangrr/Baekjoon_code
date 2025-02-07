import java.io.*;
import java.util.*;

public class Bj_17838 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            if (s.length() == 7 && (s.charAt(0) != s.charAt(2))
                    && (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(4))
                    && (s.charAt(2) == s.charAt(3) && s.charAt(3) == s.charAt(5) && s.charAt(5) == s.charAt(6))) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}
