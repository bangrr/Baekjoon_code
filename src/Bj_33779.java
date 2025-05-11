import java.io.*;

public class Bj_33779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        for (int i=0; i<len/2; i++) {
            if (s.charAt(i) != s.charAt(len-1-i)) {
                System.out.print("boop");
                return;
            }
        }
        System.out.print("beep");
    }
}