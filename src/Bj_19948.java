import java.io.*;
import java.util.*;

public class Bj_19948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = " " + br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=1; i<s.length(); i++) {
            char p = s.charAt(i-1);
            char c = s.charAt(i);
            if (p != c) {
                if (c == ' ') {
                    if (n > 0) {
                        n--;
                    } else {
                        System.out.print(-1);
                        return;
                    }
                } else if (p == ' ') {
                    sb.append(Character.toUpperCase(c));
                    c = Character.toLowerCase(c);
                    if (arr[c - 'a'] > 1) {
                        arr[c - 'a']-=2;
                    } else {
                        System.out.print(-1);
                        return;
                    }
                } else {
                    c = Character.toLowerCase(c);
                    if (arr[c - 'a'] > 0) {
                        arr[c - 'a']--;
                    } else {
                        System.out.print(-1);
                        return;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}