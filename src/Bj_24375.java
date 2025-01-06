import java.io.*;
import java.util.*;

public class Bj_24375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] arr = new char[26];
        String a = br.readLine();
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
        }
        String b = br.readLine();
        for (int i = 0; i < b.length(); i++) {
            int idx = b.charAt(i) - 'a';
            if (arr[idx] > 0) {
                arr[idx]--;
                sb.append(b.charAt(i));
            }
        }
        char[] ans = sb.toString().toCharArray();
        Arrays.sort(ans);
        sb.setLength(0);
        for (char an : ans) {
            sb.append(an);
        }
        System.out.print(sb);
    }
}
