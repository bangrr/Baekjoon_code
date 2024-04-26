import java.io.*;
import java.util.*;

public class Bj_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        long[] x = new long[6+1];
        long[] y = new long[6+1];
        int cx = 0, cy = 0;
        for (int i=0; i<6; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (d == 4) {
                cy+=m;
            } else if (d == 1) {
                cx+=m;
            } else if (d == 3) {
                cy-=m;
            } else {
                cx-=m;
            }
            x[i] = cx; y[i] = cy;
        }
        x[6] = x[0];
        y[6] = y[0];

        long rd = 0;
        long ru = 0;
        for (int i=0; i<6; i++) {
            rd += (x[i] * y[i+1]);
            ru += (y[i] * x[i+1]);
        }
        double ans = 0.5 * Math.abs(rd - ru);
        System.out.printf("%.0f", ans * k);
    }
}