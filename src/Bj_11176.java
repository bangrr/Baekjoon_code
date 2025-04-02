import java.io.*;
import java.util.*;

public class Bj_11176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(br.readLine());
                if (c > e) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}