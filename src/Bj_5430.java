import java.io.*;
import java.util.*;

public class Bj_5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            ArrayDeque<Integer> ad = new ArrayDeque<>();
            String s = br.readLine();
            st = new StringTokenizer(s.substring(1, s.length() - 1), ",");
            for (int i = 0; i < n; i++) {
                ad.addLast(Integer.parseInt(st.nextToken()));
            }

            boolean rev = false;
            boolean err = false;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'R') {
                    rev = !rev;
                } else if (p.charAt(i) == 'D') {
                    if (ad.isEmpty()) {
                        sb.append("error\n");
                        err = true;
                        break;
                    }
                    if (rev) {
                        ad.pollLast();
                    } else {
                        ad.pollFirst();
                    }
                } else {
                    throw new Exception("undefined p.char(i)");
                }
            }

            if (!err) {
                sb.append("[");
                while (!ad.isEmpty()) {
                    sb.append(rev ? ad.pollLast() : ad.pollFirst()).append(",");
                }
                if (sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("]\n");
            }
        }
        System.out.print(sb);
    }
}