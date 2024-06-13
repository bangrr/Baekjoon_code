import java.io.*;
import java.util.*;

public class Bj_31616 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char c = s.charAt(0);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != c) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}