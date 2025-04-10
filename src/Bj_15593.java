import java.io.*;
import java.util.*;

public class Bj_15593 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] check = new int[1000];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            for (int k = arr[i][0]; k < arr[i][1]; k++) {
                check[k]++;
            }
        }
        for (int b : check) {
            if (b > 0) cnt++;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int k = arr[i][0]; k < arr[i][1]; k++) {
                if (check[k] == 1) tmp++;
            }
            ans = Math.max(ans, cnt-tmp);
        }
        System.out.print(ans);
    }
}