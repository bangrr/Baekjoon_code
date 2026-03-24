import java.io.*;
import java.util.*;

public class Bj_14173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());
        int xl = Math.min(x1, x3);
        int yl = Math.min(y1, y3);
        int xr = Math.max(x2, x4);
        int yr = Math.max(y2, y4);
        int m = Math.max(xr-xl, yr-yl);
        System.out.print(m*m);
    }
}