import java.io.*;
import java.util.*;

public class Bj_15784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i][b] > arr[a][b]) {
                System.out.println("ANGRY");
                return;
            }
        }

        for (int j = 1; j <= n; j++) {
            if (arr[a][j] > arr[a][b]) {
                System.out.println("ANGRY");
                return;
            }
        }

        System.out.print("HAPPY");
    }
}