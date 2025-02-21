import java.io.*;
import java.util.*;

public class Bj_27982 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][][] arr = new boolean[n+2][n+2][n+2];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[a][b][c] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (arr[i][j][k]) {
                        if (arr[i-1][j][k] && arr[i+1][j][k] && arr[i][j-1][k] && arr[i][j+1][k] && arr[i][j][k-1] && arr[i][j][k+1]) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}