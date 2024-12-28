import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bj_29753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        BigDecimal x = new BigDecimal(st.nextToken());

        Map<String, BigDecimal> map = new LinkedHashMap<>();
        map.put("F", new BigDecimal("0.00"));
        map.put("D0", new BigDecimal("1.00"));
        map.put("D+", new BigDecimal("1.50"));
        map.put("C0", new BigDecimal("2.00"));
        map.put("C+", new BigDecimal("2.50"));
        map.put("B0", new BigDecimal("3.00"));
        map.put("B+", new BigDecimal("3.50"));
        map.put("A0", new BigDecimal("4.00"));
        map.put("A+", new BigDecimal("4.50"));

        BigDecimal sum = new BigDecimal(0);
        BigDecimal cnt = new BigDecimal(0);
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            BigDecimal c = new BigDecimal(st.nextToken());
            String s = st.nextToken();
            BigDecimal g = map.get(s);
            cnt = cnt.add(c);
            sum = sum.add(c.multiply(g));
        }
        BigDecimal l = new BigDecimal(br.readLine());
        cnt = cnt.add(l);

        for (String key : map.keySet()) {
            BigDecimal v = map.get(key);
            if (sum.add(l.multiply(v)).divide(cnt, 2, RoundingMode.FLOOR).compareTo(x) > 0) {
                System.out.print(key);
                return;
            }
        }
        System.out.print("impossible");
    }
}
