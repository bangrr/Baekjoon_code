import java.io.*;
import java.util.*;

public class Bj_33488 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append("YES\n");
            for (int i = 1; i <= n; i++) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
