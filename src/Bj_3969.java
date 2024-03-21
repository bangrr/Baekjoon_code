import java.util.*;
import java.io.*;

public class Bj_3969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] str = br.readLine().toCharArray();
            int[] arr = new int[26];
            for (int i=0; i<str.length; i++) {
                if (str[i] > 64) arr[str[i]-'A']++;
            }
            int max = 0;
            int idx = 0;
            int cnt = 0;
            for (int i=0; i<arr.length; i++) {
                if (max < arr[i]) {
                    max = Math.max(max, arr[i]);
                    idx = i;
                    cnt = 1;
                } else if (max == arr[i]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                int ans = idx < 4 ? idx+26-4 : idx-4;
                sb.append(ans).append(" ");
                for (int i=0; i<str.length; i++) {
                    char c = ' ';
                    if (str[i] > 64) {
                        c = (char)(str[i]-ans);
                        if (c < 'A') c += 26;
                    }
                    sb.append(c);
                }
                sb.append("\n");
            } else {
                sb.append("NOT POSSIBLE\n");
            }
        }
        System.out.println(sb);
    }
}