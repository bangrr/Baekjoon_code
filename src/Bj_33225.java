import java.io.*;
import java.util.*;

public class Bj_33225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine() + ".";
        char prev = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (prev == cur) {
                cnt++;
            } else {
                sb.append(String.valueOf(prev).repeat(cnt-1));
                cnt = 1;
            }
            prev = cur;
        }
        System.out.print(sb);
    }
}
