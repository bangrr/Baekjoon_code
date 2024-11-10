import java.io.*;
import java.util.*;

public class Bj_4435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[] g = new int[]{1, 2, 3, 3, 4, 10};
        int[] s = new int[]{1, 2, 2, 2, 3, 5, 10};
        for (int k = 1; k <= t; k++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < g.length; i++) {
                sum += (g[i] * Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < s.length; i++) {
                sum -= (s[i] * Integer.parseInt(st.nextToken()));
            }
            sb.append(String.format("Battle %d: ", k));
            sb.append(sum > 0 ? "Good triumphs over Evil" : sum < 0 ? "Evil eradicates all trace of Good" : "No victor on this battle field").append("\n");
        }
        System.out.print(sb);
    }
}