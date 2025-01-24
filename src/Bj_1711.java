import java.io.*;
import java.util.*;

public class Bj_1711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Long.parseLong(st.nextToken());
            y[i] = Long.parseLong(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long dx1 = x[i] - x[j];
                    long dy1 = y[i] - y[j];
                    long dx2 = x[j] - x[k];
                    long dy2 = y[j] - y[k];
                    long dx3 = x[k] - x[i];
                    long dy3 = y[k] - y[i];

                    long aa = dx1 * dx1 + dy1 * dy1;
                    long bb = dx2 * dx2 + dy2 * dy2;
                    long cc = dx3 * dx3 + dy3 * dy3;

                    if (aa + bb == cc || bb + cc == aa || cc + aa == bb) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}
