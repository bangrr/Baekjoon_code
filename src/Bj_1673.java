import java.io.*;
import java.util.*;

public class Bj_1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int ans = 0;
            int stamp = 0;
            while (n > 0) {
                ans += n;
                stamp += n % k;
                n = n / k;
                if (stamp >= k) {
                    n += stamp / k;
                    stamp = stamp % k;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}