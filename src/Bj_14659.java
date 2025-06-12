import java.io.*;
import java.util.*;

public class Bj_14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int ans = 0;
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int next = Integer.parseInt(st.nextToken());
            if (next > max) {
                max = next;
                ans = Math.max(ans, cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        System.out.print(Math.max(ans, cnt));
    }
}