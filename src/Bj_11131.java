import java.io.*;
import java.util.*;

public class Bj_11131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int w = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                w += Integer.parseInt(st.nextToken());
            }
            sb.append(w > 0 ? "Right" : w < 0 ? "Left" : "Equilibrium").append("\n");
        }
        System.out.print(sb);
    }
}