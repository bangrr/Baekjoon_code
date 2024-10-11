import java.io.*;
import java.util.*;

public class Bj_6165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = x[j] - x[i];
                int dy = y[j] - y[i];
                double slope = (double)dy/dx;
                if (slope == Double.NEGATIVE_INFINITY) {
                    slope = Double.POSITIVE_INFINITY;
                } else if (slope == -0.0) {
                    slope = 0.0;
                }
                set.add(slope);
            }
        }
        System.out.print(set.size());
    }
}