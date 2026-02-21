import java.io.*;
import java.util.*;

public class Bj_15886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int ans = 0;
        if (s.charAt(0) == 'W') {
            ans++;
        }
        if (s.charAt(s.length() - 1) == 'E') {
            ans++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.startsWith("EW", i)) {
                ans++;
            }
        }
        System.out.print(ans);
    }
}