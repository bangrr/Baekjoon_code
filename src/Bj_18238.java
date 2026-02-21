import java.io.*;
import java.util.*;

public class Bj_18238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cur = 0;
        int ans = 0;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A';
            if (c > cur) {
                ans += Math.min(c - cur, cur + 26 - c);
            } else {
                ans += Math.min(cur - c, c + 26 - cur);
            }
            cur = c;
        }
        System.out.print(ans);
    }
}