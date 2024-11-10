import java.io.*;
import java.util.*;

public class Bj_17614 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=1; i<=n; i++) {
            String s = String.valueOf(i);
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') sum++;
            }
        }
        System.out.print(sum);
    }
}