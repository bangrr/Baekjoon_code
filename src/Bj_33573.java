import java.io.*;
import java.util.*;

public class Bj_33573 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long r = Long.parseLong(new StringBuilder().append(n).reverse().toString());

            long sn = (long) Math.sqrt(n);
            long sr = (long) Math.sqrt(r);

            if (sn * sn == n && sr * sr == r) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}