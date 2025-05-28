import java.io.*;
import java.util.*;

public class Bj_33497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int xCnt = 0;
        char[][] table = new char[n][m];
        for (int i = 0; i < m; i++) {
            int sum = arr[i][0] + arr[i][1];
            if (sum > n) {
                System.out.print("NO");
                return;
            }
            int x = Math.min(n - sum, n - cnt);
            for (int j = 0; j < x; j++) {
                table[cnt + j][i] = 'X';
                xCnt++;
            }
            cnt += x;
            int a = arr[i][0];
            for (int j = 0; j < x + arr[i][0]; j++) {
                if (a == 0) {
                    break;
                }
                if (table[j][i] != 'X') {
                    table[j][i] = '+';
                    a--;
                }
            }
            for (int j = arr[i][0]; j < n; j++) {
                if (table[j][i] != 'X' && table[j][i] != '+') {
                    table[j][i] = '-';
                }
            }
        }
        if (xCnt != n) {
            System.out.print("NO");
            return;
        }
        sb.append("YES\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(table[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}