import java.io.*;
import java.util.*;

public class Bj_23808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String sin = "@".repeat(n);
        String mul = "@".repeat(n * 5);
        String spc = " ".repeat(n * 3);
        for (int i = 0; i < n * 5; i++) {
            if (i < n * 2) {
                sb.append(sin).append(spc).append(sin).append("\n");
            } else if (i < n * 3) {
                sb.append(mul).append("\n");
            } else if (i < n * 4) {
                sb.append(sin).append(spc).append(sin).append("\n");
            } else {
                sb.append(mul).append("\n");
            }
        }
        System.out.print(sb);
    }
}