import java.io.*;
import java.util.*;

public class Bj_15351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine().replaceAll("\\s+", "");
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i)-64;
            }
            sb.append(sum == 100 ? "PERFECT LIFE" : sum).append("\n");
        }
        System.out.print(sb);
    }
}