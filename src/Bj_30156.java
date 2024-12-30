import java.io.*;
import java.util.*;

public class Bj_30156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int n = s.length();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'a') cnt++;
            }
            sb.append(Math.min(cnt, n-cnt)).append("\n");
        }
        System.out.print(sb);
    }
}
