import java.io.*;
import java.util.*;

public class Bj_2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i=1; ; i++) {
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            if (b == 0) {
                break;
            }

            double d = a * Math.PI * b / 5280 / 12;
            double e = d / c * 3600;

            sb.append(String.format("Trip #%d: %.2f %.2f\n", i, d, e));
        }
        System.out.print(sb);
    }
}