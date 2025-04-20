import java.io.*;

public class Bj_16968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int ans = s.charAt(0) == 'c' ? 26 : 10;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'c') {
                if (s.charAt(i - 1) == 'c') {
                    ans *= 25;
                } else {
                    ans *= 26;
                }
            } else {
                if (s.charAt(i - 1) == 'c') {
                    ans *= 10;
                } else {
                    ans *= 9;
                }
            }
        }
        System.out.print(ans);
    }
}