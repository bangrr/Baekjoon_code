import java.io.*;
import java.util.*;

public class Bj_21614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = " ";
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 99999) break;

            int a = n / 10000 + n / 1000;

            if (a % 2 == 1) {
                s = "left ";
            } else if (a != 0) {
                s = "right ";
            }
            sb.append(s).append(n % 1000).append("\n");
        }
        System.out.print(sb);
    }
}