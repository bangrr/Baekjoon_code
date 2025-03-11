import java.io.*;
import java.util.*;

public class Bj_14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p' && s.charAt(i+1) == 'i') {
                    i+=1;
                } else if (s.charAt(i) == 'k' && s.charAt(i+1) == 'a') {
                    i+=1;
                } else if (s.charAt(i) == 'c' && s.charAt(i+1) == 'h' && s.charAt(i+2) == 'u') {
                    i+=2;
                } else {
                    System.out.print("NO");
                    return;
                }
            }
            System.out.print("YES");
        } catch (Exception e) {
            System.out.print("NO");
        }
    }
}