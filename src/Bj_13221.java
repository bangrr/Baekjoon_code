import java.io.*;
import java.util.*;

public class Bj_13221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int min = 200;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int mht = Math.abs(a - x) + Math.abs(b - y);
            if (min >= mht) {
                min = mht;
                sb.setLength(0);
                sb.append(a).append(" ").append(b).append("\n");
            }
        }
        System.out.print(sb);
    }
}