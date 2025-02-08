import java.io.*;
import java.util.*;

public class Bj_10041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int sx = 0, sy = 0;
            st = new StringTokenizer(br.readLine());
            int nx = Integer.parseInt(st.nextToken());
            int ny = Integer.parseInt(st.nextToken());
            sx += (nx - x);
            sy += (ny - y);
            if (sx * sy > 0) {
                ans += (Math.max(Math.abs(sx), Math.abs(sy)));
            } else {
                ans += (Math.abs(sx) + Math.abs(sy));
            }
            x = nx;
            y = ny;
        }
        System.out.print(ans);
    }
}
