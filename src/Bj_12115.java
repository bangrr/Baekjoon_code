import java.io.*;
import java.util.*;

public class Bj_12115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            int ans = 0;
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (b[j] == -1) continue;

                    if (b[j] != arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans++;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}