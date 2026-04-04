import java.io.*;
import java.util.*;

public class Bj_19796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            for (int j = l-1; j < r; j++) {
                arr[j] = true;
            }
        }

        String ans = "YES";
        for (int i = 0; i < m; i++) {
            if (!arr[i]) {
                ans = "NO";
                break;
            }
        }
        System.out.print(ans);
    }
}