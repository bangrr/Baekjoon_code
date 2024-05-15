import java.io.*;
import java.util.*;

public class Bj_31823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m+1];
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            int rs = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                char ch = st.nextToken().charAt(0);
                if (ch == '.') {
                    rs++;
                } else if (ch == '*') {
                    tmp = Math.max(tmp, rs);
                    rs = 0;
                }
            }
            int ans = Math.max(tmp, rs);
            arr[ans]++;
            sb.append(ans).append(" ").append(st.nextToken()).append("\n");
        }
        int cnt = 0;
        for (int it : arr) {
            if (it > 0) cnt++;
        }
        System.out.println(cnt);
        System.out.print(sb);
    }
}