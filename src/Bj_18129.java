import java.io.*;
import java.util.*;

public class Bj_18129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        boolean[] arr = new boolean[100];
        st = new StringTokenizer(br.readLine());
        String s = st.nextToken().toLowerCase() + " ";
        int k = Integer.parseInt(st.nextToken());
        int c = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                c++;
            } else if (!arr[s.charAt(i)-'a']) {
                if (c < k) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
                c = 1;
                arr[s.charAt(i)-'a'] = true;
            }
        }
        System.out.print(sb);
    }
}