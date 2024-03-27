import java.io.*;
import java.util.*;

public class Bj_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        double[][] d = new double[n][n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i > j) d[i][j] = -(double)(a[j]-a[i])/(j-i);
                else if (i < j) d[i][j] = (double)(a[j]-a[i])/(j-i);
            }
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            int cnt = 0;
            double maxL = -0x7fffffff;
            for (int j=i-1; j>=0; j--) {
                if (maxL < d[i][j]) {
                    maxL = d[i][j];
                    cnt++;
                }
            }
            double maxR = -0x7fffffff;
            for (int j=i+1; j<n; j++) {
                if (maxR < d[i][j]) {
                    maxR = d[i][j];
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}