import java.io.*;
import java.util.*;

public class Bj_17093 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] p = new int[n][2];
        int m = Integer.parseInt(st.nextToken());
        int[][] q = new int[m][2];

        inputArray(n, p);
        inputArray(m, q);

        long ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                long dx = p[i][0] - q[j][0];
                long dy = p[i][1] - q[j][1];
                if (dx*dx + dy*dy > ans) {
                    ans = dx*dx + dy*dy;
                }
            }
        }
        System.out.print(ans);
    }

    private static void inputArray(int n, int[][] arr) throws IOException {
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
        }
    }
}