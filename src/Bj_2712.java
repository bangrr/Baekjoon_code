import java.io.*;
import java.util.*;

public class Bj_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            double n = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();
            switch (unit) {
                case "kg":
                    sb.append(String.format("%.4f lb\n", n * 2.2046));
                    break;
                case "lb":
                    sb.append(String.format("%.4f kg\n", n * 0.4536));
                    break;
                case "l":
                    sb.append(String.format("%.4f g\n", n * 0.2642));
                    break;
                case "g":
                    sb.append(String.format("%.4f l\n", n * 3.7854));
                    break;
            }
        }
        System.out.print(sb);
    }
}