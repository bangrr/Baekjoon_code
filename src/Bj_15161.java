import java.io.*;
import java.util.*;

public class Bj_15161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            Arrays.fill(arr[i], n+1);
        }
        for (int i = n; i > 0; i--) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                int row = Integer.parseInt(st.nextToken());
                for (int k=1; k<=10; k++) {
                    arr[row][k] = i;
                }
            }
            for (int j=0; j<3; j++) {
                int col = Integer.parseInt(st.nextToken());
                for (int k=1; k<=10; k++) {
                    arr[k][col] = i;
                }
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}