import java.io.*;
import java.util.*;

public class Bj_24408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int first = -1;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine().trim());
            if (first == -1) {
                first = a;
            } else {
                if (a % first == 0) {
                    sb.append(a).append("\n");
                    first = -1;
                }
            }
        }
        System.out.print(sb);
    }
}