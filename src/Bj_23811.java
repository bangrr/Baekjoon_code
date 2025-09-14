import java.io.*;
import java.util.*;

public class Bj_23811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n * 5; i++) {
            if (i < n || i >= 2 * n && i < 3 * n || i >= n * 4) {
                sb.append("@".repeat(n * 5));
            } else {
                sb.append("@".repeat(n));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}