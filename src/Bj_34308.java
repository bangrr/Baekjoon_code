import java.io.*;
import java.util.*;

public class Bj_34308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            sb.append(Integer.parseInt(st.nextToken()) <= (n+1) / 2 ? 1 : n).append(" ");
        }
        System.out.print(sb);
    }
}