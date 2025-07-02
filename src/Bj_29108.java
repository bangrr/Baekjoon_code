import java.io.*;

public class Bj_29108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String str = s.substring(0, Math.min(s.length(), 2));
        String num = s.substring(Math.min(s.length(), 2));
        System.out.print("io".equals(str) && s.length() > 2 && check(num) ? "Correct" : "Incorrect");
    }

    static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}