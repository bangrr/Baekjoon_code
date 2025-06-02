import java.io.*;
import java.util.*;

public class Bj_17211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double gg = Double.parseDouble(st.nextToken());
        double gb = Double.parseDouble(st.nextToken());
        double bg = Double.parseDouble(st.nextToken());
        double bb = Double.parseDouble(st.nextToken());

        double g = s == 0 ? 1 : 0;
        double b = s == 1 ? 1 : 0;

        for (int i = 1; i <= n; i++) {
            double ng = g * gg + b * bg;
            double nb = g * gb + b * bb;
            g = ng;
            b = nb;
        }
        System.out.println((int) (Math.round(g * 1000) / 10.0 * 10));
        System.out.print((int) (Math.round(b * 1000) / 10.0 * 10));
    }
}