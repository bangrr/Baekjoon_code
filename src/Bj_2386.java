import java.io.*;
import java.util.*;

public class Bj_2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String s = br.readLine().toLowerCase();
            char c = s.charAt(0);
            if (c == '#') break;
            s = s.substring(2);
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    cnt++;
                }
            }
            sb.append(c).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}