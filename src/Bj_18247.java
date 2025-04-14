import java.io.*;
import java.util.*;

public class Bj_18247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(n >= 12 && m >= 4 ? m * 12 - m + 4 : -1).append("\n");
        }
        System.out.print(sb);
    }
}