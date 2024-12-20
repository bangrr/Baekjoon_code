import java.io.*;
import java.util.*;

public class Bj_11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int MAX = 1000000007;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(arr[i], MAX);
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[a][b] = Math.min(arr[a][b], c);
        }
        for (int i = 1; i <= n; i++) {
            arr[i][i] = 0;
        }

        for (int v = 1; v <= n; v++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if (arr[a][v] + arr[v][b] < arr[a][b]) {
                        arr[a][b] = arr[a][v] + arr[v][b];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(arr[i][j] == MAX ? 0 : arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
