import java.io.*;
import java.util.*;

public class Bj_1531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[101][101];
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int i=x1; i<=x2; i++) {
                for (int j=y1; j<=y2; j++) {
                    arr[i][j]++;
                }
            }
        }
        int ans = 0;
        for (int i=1; i<=100; i++) {
            for (int j=1; j<=100; j++) {
                if (arr[i][j] > m) {
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}