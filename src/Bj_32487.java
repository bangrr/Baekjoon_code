import java.io.*;
import java.util.*;

public class Bj_32487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] s = br.readLine().toCharArray();
        String t = br.readLine();
        boolean h = false, v = false, r = false;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'h') h = !h;
            else if (c == 'v') v = !v;
            else if (c == 'r') r = !r;
        }

        if (h) {
            horizontalFlip(s);
        }
        if (v) {
            verticalFlip(s);
        }
        if (r) {
            horizontalFlip(s);
            verticalFlip(s);
        }

        for (char c : s) {
            sb.append(c);
        }
        System.out.print(sb);
    }

    private static void verticalFlip(char[] s) {
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            if (ch == 'b') s[i] = 'p';
            else if (ch == 'd') s[i] = 'q';
            else if (ch == 'p') s[i] = 'b';
            else if (ch == 'q') s[i] = 'd';
        }
    }

    private static void horizontalFlip(char[] s) {
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            if (ch == 'b') s[i] = 'd';
            else if (ch == 'd') s[i] = 'b';
            else if (ch == 'p') s[i] = 'q';
            else if (ch == 'q') s[i] = 'p';
        }
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }
}