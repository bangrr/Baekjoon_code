import java.io.*;
import java.util.*;

public class Bj_10178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            sb.append(String.format("You get %d piece(s) and your dad gets %d piece(s).\n", (c/v), (c%v)));
        }
        System.out.print(sb);
    }
}