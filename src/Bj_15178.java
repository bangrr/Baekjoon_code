import java.io.*;
import java.util.*;

public class Bj_15178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append(a).append(" ").append(b).append(" ").append(c).append((a+b+c) == 180 ? " Seems OK" : " Check").append("\n");
        }
        System.out.print(sb);
    }
}