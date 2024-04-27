import java.io.*;
import java.util.*;

public class Bj_30891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] x = new int[n];
        int[] y = new int[n];
        int minx = 100;
        int maxx = -100;
        int miny = 100;
        int maxy = -100;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            minx = Math.min(minx, x[i]);
            maxx = Math.max(maxx, x[i]);
            miny = Math.min(miny, y[i]);
            maxy = Math.max(maxy, y[i]);
        }

        int ans = 0;
        int ax = 0, ay = 0;
        for (int tx=minx; tx<=maxx; tx++) {
            for (int ty=miny; ty<=maxy; ty++) {
                int cnt = 0;
                for (int i=0; i<n; i++) {
                    if (Math.sqrt(Math.pow(tx-x[i], 2) + Math.pow(ty-y[i], 2)) <= r) cnt++;
                }
                if (ans < cnt) {
                    ans = cnt;
                    ax = tx;
                    ay = ty;
                }
            }
        }
        System.out.print(ax + " " + ay);
    }
}