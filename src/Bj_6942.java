import java.io.*;
import java.util.*;

public class Bj_6942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (; m <= n; m++) {
            if (check(m)) {
                cnt++;
            };
        }
        System.out.print(cnt);
    }

    private static boolean check(int m) {
        String s = String.valueOf(m);
        int len = s.length();
        if (len % 2 == 0) {
            for (int i = 0; i < (len / 2); i++) {
                if (rotate(s, i, len)) return false;
            }
        } else {
            if (s.charAt(len / 2) != '0' && s.charAt(len / 2) != '1' && s.charAt(len / 2) != '8') {
                return false;
            }
            for (int i = 0; i < len / 2; i++) {
                if (rotate(s, i, len)) return false;
            }
        }
        return true;
    }

    private static boolean rotate(String s, int i, int len) {
        if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '8') {
            return s.charAt(i) != s.charAt(len - i - 1);
        } else if (s.charAt(i) == '6') {
            return s.charAt(len - i - 1) != '9';
        } else if (s.charAt(i) == '9') {
            return s.charAt(len - i - 1) != '6';
        } else {
            return true;
        }
    }
}
