import java.io.*;
import java.util.*;

public class Bj_17011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine() + " ";
            int cnt = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    cnt++;
                } else {
                    sb.append(cnt).append(" ").append(s.charAt(i)).append(" ");
                    cnt = 1;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}