import java.io.*;

public class Bj_1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int ans = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i)) {
                ans = i;
                break;
            }
        }
        System.out.print(s.length() + ans);
    }

    private static boolean isPalindrome(String str, int idx) {
        int l = idx, r = str.length()-1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++; r--;
        }
        return true;
    }
}