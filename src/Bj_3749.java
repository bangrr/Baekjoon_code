import java.util.*;
import java.io.*;

public class Bj_3749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                System.out.print(sb);
                return;
            }

            double[] x = new double[n+1];
            double[] y = new double[n+1];
            for (int i=0; i<n; i++) {
                x[i] = Double.parseDouble(st.nextToken());
                y[i] = Double.parseDouble(st.nextToken());
            }
            x[n] = x[0];
            y[n] = y[0];

            double rd = 0;
            double ru = 0;
            for (int i=0; i<n; i++) {
                rd += (x[i] * y[i+1]);
                ru += (y[i] * x[i+1]);
            }
            double ans = 0.5 * Math.abs(rd - ru);
            ans = Math.round(ans);
            sb.append((int)ans).append("\n");
        }
    }
}