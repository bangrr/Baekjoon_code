import java.io.*;
import java.util.*;

public class Bj_9309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            sb.append(isValid(s) ? "Valid Password" : "Invalid Password").append("\n");
        }
        System.out.print(sb);
    }

    private static boolean isValid(String s) {
        return cond1(s) && cond2(s) && cond3(s) && cond4(s) &&
                cond5(s) && cond6(s) && cond7(s) && cond8(s);
    }

    private static boolean cond1(String s) {
        return 9 <= s.length() && s.length() <= 20;
    }

    private static boolean cond2(String s) {
        int ll = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLowerCase(c)) ll++;
        }
        return ll >= 2;
    }

    private static boolean cond3(String s) {
        int ul = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isUpperCase(c)) ul++;
        }
        return ul >= 2;
    }

    private static boolean cond4(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isNumber(c)) n++;
        }
        return n >= 1;
    }

    private static boolean cond5(String s) {
        int nac = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isNonAlphanumericCase(c)) nac++;
        }
        return nac >= 2;
    }

    private static boolean cond6(String s) {
        char ic = ' ';
        int cc = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ic) {
                cc++;
            } else {
                cc = 1;
            }
            ic = c;
            if (cc == 3) return false;
        }
        return true;
    }

    private static boolean cond7(String s) {
        StringBuilder bd = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isNonAlphanumericCase(c)) continue;
            if (isUpperCase(c)) c += 32;
            bd.append(c);
        }
        String ns = bd.toString();
        for (int i = 0; i < ns.length(); i++) {
            if (ns.charAt(i) != ns.charAt(ns.length()-1-i)) return true;
        }
        return false;
    }

    private static boolean cond8(String s) {
        String[] arr = {"password", "virginia", "cavalier", "code",
                "drowssap", "ainigriv", "reilavac", "edoc"};
        s = s.toLowerCase();
        for (String a : arr) {
            int p = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == a.charAt(p)) p++;
                if (p == a.length()) return false;
            }
        }
        return true;
    }

    private static boolean isLowerCase(char c) {
        return 'a' <= c && c <= 'z';
    }

    private static boolean isUpperCase(char c) {
        return 'A' <= c && c <= 'Z';
    }

    private static boolean isNumber(char c) {
        return '0' <= c && c <= '9';
    }

    private static boolean isNonAlphanumericCase(char c) {
        return c == '!' || c == '@' || c == '#' ||
                c == '$' || c == '%' || c == '^' ||
                c == '&' || c == '*' || c == '.' ||
                c == ',' || c == ';' || c == '/' || c == '?';
    }
}