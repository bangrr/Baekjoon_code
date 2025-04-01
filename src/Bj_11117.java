import java.io.*;
import java.util.*;

public class Bj_11117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int[] arr = new int[26];
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    arr[c - 'A']++;
                }
            }
            int w = Integer.parseInt(br.readLine().trim());
            while (w-- > 0) {
                int[] tmp = new int[26];
                String n = br.readLine();
                for (int i = 0; i < n.length(); i++) {
                    char c = n.charAt(i);
                    if (c >= 'A' && c <= 'Z') {
                        tmp[c - 'A']++;
                    }
                }
                String ans = "YES";
                for (int i = 0; i < 26; i++) {
                    if (tmp[i] > arr[i]) {
                        ans = "NO";
                        break;
                    }
                }
                sb.append(ans).append("\n");
            }
        }
        System.out.print(sb);
    }
}