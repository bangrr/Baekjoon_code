import java.io.*;
import java.util.*;

public class Bj_15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            int a = Integer.parseInt(br.readLine());
            boolean chk = true;
            while (a > 1) {
                if (a % 2 != 0) {
                    chk = false;
                    break;
                }
                a /= 2;
            }
            sb.append(chk ? "1" : "0").append("\n");
        }
        System.out.print(sb);
    }
}