import java.io.*;
import java.util.*;

public class Bj_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i=n; i<=m; i++) {
                String s = String.valueOf(i);
                for (int j=0; j<s.length(); j++) {
                    if (s.charAt(j) == '0') {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}