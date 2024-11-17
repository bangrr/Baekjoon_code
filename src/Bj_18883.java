import java.io.*;
import java.util.*;

public class Bj_18883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                sb.append(i * m + j).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}