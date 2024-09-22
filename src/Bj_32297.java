import java.io.*;
import java.util.*;

public class Bj_32297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String ans = "NO";
        for (int i = 0; i < n-3; i++) {
            if (s.charAt(i) == 'g' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'r' && s.charAt(i+3) == 'i') {
                ans = "YES";
                break;
            }
        }
        System.out.print(ans);
    }
}