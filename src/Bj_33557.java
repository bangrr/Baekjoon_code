import java.io.*;
import java.util.*;

public class Bj_33557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = a*b;
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            int la = as.length();
            int lb = bs.length();

            StringBuilder tmp = new StringBuilder();
            if (la > lb) {
                tmp.append(as, 0, la - lb);
                as = as.substring(la - lb);
            } else {
                tmp.append(bs, 0, lb - la);
                bs = bs.substring(lb - la);
            }
            int len = as.length();
            for (int i=0; i<len; i++) {
                tmp.append(Long.parseLong(as.substring(i, i + 1)) * Long.parseLong(bs.substring(i, i + 1)));
            }

            long d = Long.parseLong(tmp.toString());
            sb.append(Objects.equals(c, d) ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}