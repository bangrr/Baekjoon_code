import java.io.*;
import java.util.*;

public class Bj_21405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        String ans = "no";
        for (int i = 0; i < len; i++) {
            String t = s.substring(i, len) + s.substring(0, i);
            if (isPalindrome(t)) {
                ans = "yes";
                break;
            }
        }
        System.out.print(ans);
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}