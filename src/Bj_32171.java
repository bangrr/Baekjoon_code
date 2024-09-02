import java.io.*;
import java.util.*;

public class Bj_32171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int ma = 10, mb = 10, mc = -10, md = -10;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            ma = Math.min(ma, a);
            mb = Math.min(mb, b);
            mc = Math.max(mc, c);
            md = Math.max(md, d);
            sb.append((mc - ma) * 2 + (md - mb) * 2).append("\n");
        }
        System.out.print(sb);
    }
}