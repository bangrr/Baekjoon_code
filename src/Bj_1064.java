import java.io.*;
import java.util.*;

public class Bj_1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int dx1 = x2-x1;
        int dy1 = y2-y1;
        int dx2 = x3-x2;
        int dy2 = y3-y2;
        if ((dx1 == 0 && dx2 == 0) || (dy1 == 0 && dy2 == 0) || (dx1 != 0 && dx2 != 0 && dx1*dy2 == dx2*dy1)) {
            System.out.print(-1.0);
            return;
        }
        double d1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        double d2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double d3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        double[] sum = new double[3];
        sum[0] = d1*2 + d2*2;
        sum[1] = d2*2 + d3*2;
        sum[2] = d3*2 + d1*2;
        Arrays.sort(sum);
        System.out.print(sum[2]-sum[0]);
    }
}