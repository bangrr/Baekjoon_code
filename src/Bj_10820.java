import java.io.*;
import java.util.*;

public class Bj_10820 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            int q = 0, w = 0, e = 0, r = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    q++;
                } else if (c >= 'A' && c <= 'Z') {
                    w++;
                } else if (c >= '0' && c <= '9') {
                    e++;
                } else if (c == ' ') {
                    r++;
                }
            }
            sb.append(q + " " + w + " " + e + " " + r + "\n");
        }
        System.out.print(sb);
    }
}