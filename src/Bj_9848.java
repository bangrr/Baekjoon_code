import java.io.*;
import java.util.*;

public class Bj_9848 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            if (a - t >= k) {
                ans++;
            }
            a = t;
        }
        System.out.print(ans);
    }
}