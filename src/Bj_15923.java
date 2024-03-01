import java.util.*;
import java.io.*;

public class Bj_15923 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][2];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        arr[n][0] = arr[0][0]; arr[n][1] = arr[0][1];
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += (Math.abs(arr[i][0] - arr[i-1][0]) + Math.abs(arr[i][1] - arr[i-1][1]));
        }
        System.out.print(sum);
    }
}