import java.io.*;
import java.util.*;

public class Bj_9723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int aa = a * a;
            int bb = b * b;
            int cc = c * c;

            sb.append("Case #").append(i).append(": ");
            if (aa + bb == cc || bb + cc == aa || aa + cc == bb) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}