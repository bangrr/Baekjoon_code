import java.io.*;
import java.util.*;

public class Bj_1371 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[26];
        String s;
        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') arr[s.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                sb.setLength(0);
                sb.append((char)(i+'a'));
            } else if (arr[i] == max) {
                sb.append((char)(i+'a'));
            }
        }
        System.out.print(sb);
    }
}