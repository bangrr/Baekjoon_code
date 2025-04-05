import java.io.*;
import java.util.*;

public class Bj_33754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][n+2];
        arr[0][0] = arr[1][0] = arr[0][n+1] = arr[1][n+1] = 1;

        int ans = 2;
        st = new StringTokenizer(br.readLine());
        for (int j = 1; j <= n; j++) {
            arr[0][j] = Integer.parseInt(st.nextToken());
            if (arr[0][j] == 0) {
                ans = 1;
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 1; j <= n; j++) {
            arr[1][j] = Integer.parseInt(st.nextToken());
            if (arr[1][j] == 0) {
                ans = 1;
                if (arr[0][j - 1] == 0 || arr[0][j] == 0 || arr[0][j + 1] == 0) {
                     ans = 0;
                }
            }
        }
        System.out.print(ans);
    }
}