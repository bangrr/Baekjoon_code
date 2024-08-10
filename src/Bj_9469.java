import java.io.*;
import java.util.*;

public class Bj_9469 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int p = Integer.parseInt(br.readLine());
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            sb.append(n).append(" ").append(d/(a+b)*f).append("\n");
        }
        System.out.print(sb);
    }
}