import java.io.*;
import java.util.*;

public class Bj_9286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(String.format("Case %d:\n", i));
            for (int j = 0; j < n; j++) {
                int m = Integer.parseInt(br.readLine());
                if (m < 6) sb.append(m+1).append("\n");
            }
        }
        System.out.print(sb);
    }
}