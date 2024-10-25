import java.io.*;
import java.util.*;

public class Bj_7523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long ans = (m-n+1)*(n+m)/2;
            sb.append("Scenario #").append(i).append(":\n");
            sb.append(ans).append("\n");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}