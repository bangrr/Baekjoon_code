import java.io.*;
import java.util.*;

public class Bj_17247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int t = Integer.parseInt(st.nextToken());
                if (t == 1) {
                    if (x1 == -1) {
                        x1 = i;
                        y1 = j;
                    } else {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
        }
        System.out.print(Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }
}