import java.io.*;
import java.util.*;

public class Bj_13413 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();
            String b = br.readLine();
            int c = 0;
            int d = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    c += (a.charAt(i) == 'W' ? 1 : -1);
                    d++;
                }
            }
            if (c == 0) {
                sb.append(d/2).append("\n");
            } else {
                c = Math.abs(c);
                sb.append(c + (d-c)/2).append("\n");
            }
        }
        System.out.print(sb);
    }
}