import java.io.*;
import java.util.*;

public class Bj_5292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        for (int i=1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("DeadMan\n");
            } else if (i % 3 == 0) {
                sb.append("Dead\n");
            } else if (i % 5 == 0) {
                sb.append("Man\n");
            } else {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}