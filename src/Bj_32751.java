import java.io.*;
import java.util.*;

public class Bj_32751 {
    static int a, b, c, d;
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        s = br.readLine();

        System.out.print(checkBurn() && checkSingle() && checkCorrect() ? "Yes" : "No");
    }

    static boolean checkBurn() {
        return s.charAt(0) == 'a' && s.charAt(s.length() - 1) == 'a';
    }

    static boolean checkSingle() {
        for (int i = 1; i < s.length(); i++) {
            char down = s.charAt(i);
            char up = s.charAt(i - 1);
            if (down == up) {
                return false;
            }
        }
        return true;
    }

    static boolean checkCorrect() {
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'a') {
                if (a == 0) return false;
                a--;
            } else if (cur == 'b') {
                if (b == 0) return false;
                b--;
            } else if (cur == 'c') {
                if (c == 0) return false;
                c--;
            } else if (cur == 'd') {
                if (d == 0) return false;
                d--;
            } else {
                return false;
            }
        }
        return true;
    }
}