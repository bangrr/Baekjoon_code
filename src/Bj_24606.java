import java.io.*;
import java.util.*;

public class Bj_24606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        int c = 1;
        for (int i = 0; i < a.length(); i++) {
            c *= (a.charAt(i) == b.charAt(i) ? 1 : 2);
        }
        System.out.print(c);
    }
}