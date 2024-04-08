import java.io.*;
import java.util.*;

public class Bj_31562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<String, String> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                a.append(st.nextToken());
            }
            String as = a.toString();
            if (map.get(as) == null) {
                map.put(as, s);
            } else {
                map.put(as, "?");
            }
        }
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                b.append(st.nextToken());
            }
            String bs = b.toString();
            if (map.get(bs) == null) {
                sb.append("!");
            } else {
                sb.append(map.get(bs));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}