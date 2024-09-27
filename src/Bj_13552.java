import java.io.*;
import java.util.*;

public class Bj_13552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            long z = Integer.parseInt(st.nextToken());
            long r = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                long dx = arr[j][0] - x;
                long dy = arr[j][1] - y;
                long dz = arr[j][2] - z;
                if (dx*dx + dy*dy + dz*dz <= r*r) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}