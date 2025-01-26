import java.io.*;
import java.util.*;

public class Bj_6600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double e = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());

            double x, y, r;
            y = ((c*c-a*a+d*d-b*b)*2*(a-e) - (e*e-a*a+f*f-b*b)*2*(a-c)) / (2*(b-d)*2*(a-e) - 2*(b-f)*2*(a-c));
            x = a!=c ? (c*c-a*a+d*d-b*b-2*(b-d)*y) / (2*(a-c)) : (e*e-a*a+f*f-b*b-2*(b-f)*y) / (2*(a-e));
            r = Math.sqrt((x+a)*(x+a) + (y+b)*(y+b));
            sb.append(String.format("%.2f", 2*Math.PI*r)).append('\n');
        }
        System.out.print(sb);
    }
}
