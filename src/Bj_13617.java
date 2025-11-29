import java.io.*;
import java.util.*;

public class Bj_13617 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans = 0;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            boolean flag = true;
            for (int j=0; j<m; j++) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans++;
        }
        System.out.print(ans);
    }
}