import java.io.*;
import java.util.*;

public class Bj_26332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            sb.append(c).append(" ").append(p).append("\n");
            sb.append(c*p-2*(c-1)).append("\n");
        }
        System.out.print(sb);
    }
}