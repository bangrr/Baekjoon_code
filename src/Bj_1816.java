import java.io.*;
import java.util.*;

public class Bj_1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long s = Long.parseLong(br.readLine());
            boolean chk = true;
            for (int j = 2; j <= 1000000; j++) {
                if (s % j == 0) {
                    chk = false;
                    break;
                }
            }
            sb.append(chk ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}