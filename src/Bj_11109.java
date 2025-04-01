import java.io.*;
import java.util.*;

public class Bj_11109 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            if (s*n > d + p*n) {
                sb.append("parallelize\n");
            } else if (s*n < d + p*n) {
                sb.append("do not parallelize\n");
            } else {
                sb.append("does not matter\n");
            }
        }
        System.out.print(sb);
    }
}