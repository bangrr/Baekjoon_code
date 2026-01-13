import java.io.*;
import java.util.*;

public class Bj_7366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                String str = st.nextToken();
                if ("sheep".equals(str)) {
                    cnt++;
                }
            }
            sb.append("Case ").append(i).append(": This list contains ").append(cnt).append(" sheep.\n\n");
        }
        System.out.print(sb);
    }
}