import java.io.*;
import java.util.*;

public class Bj_17177 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // x*x = a*a - b*b;
        // y*y = a*a - c*c;
        // x*y = Math.sqrt((a*a - b*b) * (a*a - c*c));
        // d = (x*y - b*c) / a;
        // d = (Math.sqrt((a*a - b*b) * (a*a - c*c)) - b*c) / a;
        double d = -1;
        d = (Math.sqrt((a*a - b*b) * (a*a - c*c)) - b*c) / a;
        if (d < 1) System.out.print(-1);
        else System.out.print((int)d);
    }
}