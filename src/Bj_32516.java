import java.io.*;
import java.util.*;

public class Bj_32516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != '?' && s.charAt(n - 1 - i) != '?') {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    cnt = 0;
                    break;
                }
            } else if (s.charAt(i) == '?' && s.charAt(n - 1 - i) == '?') {
                cnt += 26;
            } else {
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}