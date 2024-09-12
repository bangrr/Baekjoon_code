import java.io.*;
import java.util.*;

public class Bj_5724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}