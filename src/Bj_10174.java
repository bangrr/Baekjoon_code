import java.io.*;
import java.util.*;

public class Bj_10174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine().toLowerCase();
            int len = s.length();
            boolean isPalindrome = true;
            for (int j=0; j<len/2; j++) {
                if (s.charAt(j) != s.charAt(len-j-1)) {
                    isPalindrome = false;
                    break;
                }
            }
            sb.append(isPalindrome ? "Yes\n" : "No\n");
        }
        System.out.print(sb);
    }
}