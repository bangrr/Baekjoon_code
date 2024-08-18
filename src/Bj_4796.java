import java.io.*;
import java.util.*;

public class Bj_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int i=0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            i++;
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l == 0 && p == 0 && v == 0) break;
            sb.append(String.format("Case %d: %d\n", i, v/p*l + Math.min(v%p, l)));
        }
        System.out.print(sb);
    }
}