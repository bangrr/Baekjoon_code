import java.io.*;
import java.util.*;

public class Bj_29835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) < s.charAt(n - i - 1)) {
                sb.append(s.charAt(i));
                cnt++;
            } else if (s.charAt(i) > s.charAt(n - i - 1)) {
                sb.append(s.charAt(n - i - 1));
                cnt++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(cnt);
        System.out.print(sb);
        if (n % 2 == 1) System.out.print(s.charAt(n/2));
        System.out.print(sb.reverse());
    }
}