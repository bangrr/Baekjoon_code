import java.io.*;
import java.util.*;

public class Bj_34021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int min = 1440;
            for (int i = 0; i < n; i++) {
                int s = Integer.parseInt(st.nextToken());
                if (s >= 0) {
                    min = Math.min(min, s);
                }
            }
            int ans = Math.max(m-min, l);
            sb.append("The scoreboard has been frozen with ").append(ans).append(ans == 1 ? " minute" : " minutes").append(" remaining.\n");
        }
        System.out.print(sb);
    }
}