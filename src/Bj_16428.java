import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Bj_16428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        BigDecimal d = a.divide(b, 0, RoundingMode.DOWN);
        BigDecimal r = a.remainder(b);

        if (a.compareTo(BigDecimal.ZERO) < 0) {
            if (b.compareTo(BigDecimal.ZERO) < 0) {
                d = d.add(BigDecimal.ONE);
                r = r.subtract(b);
            } else {
                d = d.subtract(BigDecimal.ONE);
                r = r.add(b);
            }
        }

        System.out.println(d);
        System.out.print(r);
    }
}