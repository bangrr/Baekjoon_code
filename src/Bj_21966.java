import java.io.*;
import java.util.*;

public class Bj_21966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if (n <= 25) {
            sb.append(s);
        } else if (chkSameSentence(s.substring(11, n-11))) {
            for (int i = 0; i < 11; i++) {
                sb.append(s.charAt(i));
            }
            sb.append(".".repeat(3));
            for (int i = n-11; i < n; i++) {
                sb.append(s.charAt(i));
            }
        } else {
            for (int i = 0; i < 9; i++) {
                sb.append(s.charAt(i));
            }
            sb.append(".".repeat(6));
            for (int i = n-10; i < n; i++) {
                sb.append(s.charAt(i));
            }
        }
        System.out.print(sb);
    }

    private static boolean chkSameSentence(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == '.') {
                return false;
            }
        }
        return true;
    }
}