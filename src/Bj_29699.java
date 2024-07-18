import java.io.*;

public class Bj_29699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "WelcomeToSMUPC";
        int len = s.length();
        int n = Integer.parseInt(br.readLine()) % len;
        System.out.print(n == 0 ? s.charAt(len-1) : s.charAt(n-1));
    }
}