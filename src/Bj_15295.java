import java.io.*;
import java.util.*;

public class Bj_15295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int p = Integer.parseInt(br.readLine());
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sb.append(k).append(" ").append(n*(n+1)/2+n).append("\n");
        }
        System.out.print(sb);
    }
}