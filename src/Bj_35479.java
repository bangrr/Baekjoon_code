import java.io.*;
import java.util.*;

public class Bj_35479 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double c, m, y, k;
        double dr = r/255.0;
        double dg = g/255.0;
        double db = b/255.0;
        k = 1-Math.max(dr, Math.max(dg, db));
        if (k == 1) {
            System.out.print("0 0 0 1");
        } else {
            double dk = 1-k;
            c = (dk-dr)/dk;
            m = (dk-dg)/dk;
            y = (dk-db)/dk;
            System.out.printf("%f %f %f %f\n", c, m, y, k);
        }
    }
}