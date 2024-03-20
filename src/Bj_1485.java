import java.util.*;
import java.io.*;

public class Bj_1485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long[] x = new long[4];
            long[] y = new long[4];
            for (int i=0; i<4; i++) {
                st = new StringTokenizer(br.readLine());
                x[i] = Long.parseLong(st.nextToken());
                y[i] = Long.parseLong(st.nextToken());
            }
            double[] arr = new double[6];
            int c = 0;
            for (int i=0; i<3; i++) {
                for (int j=i+1; j<4; j++) {
                    arr[c++] = Math.sqrt((x[j]-x[i])*(x[j]-x[i]) + (y[j]-y[i])*(y[j]-y[i]));
                }
            }
            Arrays.sort(arr);
            if (arr[0]==arr[3] && arr[4]==arr[5]) sb.append(1);
            else sb.append(0);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}