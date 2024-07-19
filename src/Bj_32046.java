import java.io.*;
import java.util.*;

public class Bj_32046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (sum + a <= 300) {
                    sum += a;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}