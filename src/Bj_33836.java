import java.io.*;
import java.util.*;

public class Bj_33836 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cnt;

            if (y == 0) {
                if (x >= 0) {
                    cnt = 0;
                } else {
                    cnt = 1;
                }
            } else if (x >= 0) {
                cnt = 1;
            } else if ((x - y) >= 0) {
                cnt = 1;
            } else {
                cnt = 2;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}