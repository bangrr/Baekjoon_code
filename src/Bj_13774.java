import java.io.*;
import java.util.*;

public class Bj_13774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if ("#".equals(s)) break;

            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                String str = s.substring(0, i) + s.substring(i + 1);
                if (isPalindrome(str)) {
                    ans = str;
                    break;
                }
            }
            if (ans.isEmpty()) {
                sb.append("not possible\n");
            } else {
                sb.append(ans).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}