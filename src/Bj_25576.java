import java.io.*;
import java.util.*;

public class Bj_25576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    arr[j] = Integer.parseInt(st.nextToken());
                } else {
                    sum += (Math.abs(arr[j] - Integer.parseInt(st.nextToken())));
                }
            }
            if (sum > 2000) {
                cnt++;
            }
        }
        System.out.print(n/2 <= cnt ? "YES" : "NO");
    }
}