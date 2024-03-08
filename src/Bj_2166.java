import java.util.*;
import java.io.*;

public class Bj_2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        x[n] = x[0];
        y[n] = y[0];

        long rd = 0;
        long ru = 0;
        for (int i=0; i<n; i++) {
            rd += (x[i] * y[i+1]);
            ru += (y[i] * x[i+1]);
        }
        double ans = 0.5 * Math.abs(rd - ru);
        System.out.printf("%.1f", ans);
    }
}