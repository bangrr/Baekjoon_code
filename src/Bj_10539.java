import java.io.*;
import java.util.*;

public class Bj_10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            long t = Long.parseLong(st.nextToken());
            long c = t * i - sum;
            sb.append(c).append(" ");
            sum += c;
        }
        System.out.print(sb);
    }
}