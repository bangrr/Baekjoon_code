import java.io.*;
import java.util.*;

public class Bj_3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int a = Integer.parseInt(br.readLine());
            StringBuilder tmp = new StringBuilder();
            tmp.append(a);
            int b = Integer.parseInt(tmp.reverse().toString());
            String c = String.valueOf(a + b);
            boolean flag = true;
            for (int i=0; i<c.length()/2; i++) {
                if (c.charAt(i) != c.charAt(c.length()-i-1)) {
                    flag = false;
                }
            }
            sb.append(flag ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}