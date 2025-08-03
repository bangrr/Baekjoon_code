import java.io.*;
import java.util.*;

public class Bj_11880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long ah = a*a + (b+c)*(b+c);
            long bh = b*b + (a+c)*(a+c);
            long ch = c*c + (a+b)*(a+b);
            long ans = Math.min(ah, Math.min(bh, ch));
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}