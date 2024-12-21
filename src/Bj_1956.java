import java.io.*;
import java.util.*;

public class Bj_1956 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int MAX = 1000000007;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(arr[i], MAX);
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[a][b] = c;
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

        int ans = MAX;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i != j && j <= n; j++) {
                if (arr[i][j] != MAX && arr[j][i] != MAX) {
                    ans = Math.min(ans, arr[i][j] + arr[j][i]);
                }
            }
        }
        System.out.print(ans == MAX ? -1 : ans);
    }
}
