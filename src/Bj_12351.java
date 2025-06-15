import java.io.*;
import java.util.*;

public class Bj_12351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int k = 1; k <= t; k++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            double[] arr = new double[n];
            for (int i=0; i<n; i++) {
                arr[i] = Double.parseDouble(st.nextToken());
            }
            for (int i=1; i<n-1; i++) {
                double tmp = (arr[i - 1] + arr[i + 1]) / 2;
                if (tmp < arr[i]) {
                    arr[i] = tmp;
                }
            }
            sb.append("Case #").append(k).append(": ").append(arr[n-2]).append("\n");
        }
        System.out.print(sb);
    }
}