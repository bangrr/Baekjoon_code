import java.io.*;
import java.util.*;

public class Bj_32994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = 1;
        for (int i = 0; i < n; i++) {
            int c = r;
            for (int j = 0; j < m; j++) {
                sb.append(c++).append(" ");
                if (c > 5) {
                    c = 1;
                }
            }
            r+=2;
            if (r > 5) {
                r -= 5;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
