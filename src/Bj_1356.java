import java.io.*;
import java.util.*;

public class Bj_1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();

        for (int i=1; i<len; i++) {
            int sm = 1;
            for (int j=0; j<i; j++) {
                sm *= Integer.parseInt(String.valueOf(s.charAt(j)));
            }

            int rm = 1;
            for (int j=i; j<len; j++) {
                rm *= Integer.parseInt(String.valueOf(s.charAt(j)));
            }

            if (sm == rm) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}