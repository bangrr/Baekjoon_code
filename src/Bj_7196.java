import java.util.*;
import java.io.*;

public class Bj_7196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        int cx = 0, cy = 0;
        String s = br.readLine();
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (c == 'N') {
                cy++;
            } else if (c == 'E') {
                cx++;
            } else if (c == 'S') {
                cy--;
            } else {
                cx--;
            }
            x[i] = cx; y[i] = cy;
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
        System.out.printf("%.0f", ans);
    }
}