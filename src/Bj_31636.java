import java.io.*;
import java.util.*;

public class Bj_31636 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i=1; i<n-1; i++) {
            if (s.charAt(i-1) == 'o' && s.charAt(i) == 'o' && s.charAt(i+1) == 'o') {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}