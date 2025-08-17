import java.io.*;
import java.util.*;

public class Bj_34125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        double min = 1000;
        int r = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    double d = i + Math.abs((m + 1) / 2 - j);
                    if (d < min) {
                        min = d;
                        r = i;
                        c = j;
                    }
                }
            }
        }
        if (r == 0 && c == 0) {
            System.out.print(-1);
        } else {
            System.out.print(r + " " + c);
        }
    }
}