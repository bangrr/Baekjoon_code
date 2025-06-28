import java.io.*;
import java.util.*;

public class Bj_5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double aa = 350.34;
        double bb = 230.90;
        double cc = 190.55;
        double dd = 125.30;
        double ee = 180.90;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            double ans = (a*aa + b*bb + c*cc + d*dd + e*ee);
            sb.append(String.format("$%.2f", ans)).append("\n");
        }
        System.out.print(sb);
    }
}