import java.io.*;
import java.util.*;

public class Bj_26767 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                sb.append("Wiwat!").append("\n");
            } else if (i % 7 == 0) {
                sb.append("Hurra!").append("\n");
            } else if (i % 11 == 0) {
                sb.append("Super!").append("\n");
            } else {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}