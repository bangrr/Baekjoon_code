import java.io.*;
import java.util.*;

public class Bj_11161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int m = Integer.parseInt(br.readLine());
            int max = 0;
            int sum = 0;
            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                sum = sum + p2 - p1;
                max = Math.max(max, sum);
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}