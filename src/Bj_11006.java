import java.io.*;
import java.util.*;

public class Bj_11006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int a = m * 2 - n;
            int b = m - a;
            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.print(sb);
    }
}
