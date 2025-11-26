import java.io.*;
import java.util.*;

public class Bj_4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            if (a1 == 0 && a2 == 0 && a3 == 0) break;

            if (a3 - a2 == a2 - a1) {
                sb.append("AP ").append(a3 + a3 - a2).append("\n");
            } else {
                sb.append("GP ").append(a3 * a3 / a2).append("\n");
            }
        }
        System.out.print(sb);
    }
}