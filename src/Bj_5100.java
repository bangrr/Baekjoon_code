import java.io.*;
import java.util.*;

public class Bj_5100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = new int[5];
            for (int i=0; i<n; i++) {
                String s = br.readLine();
                boolean isNumber = s.matches("\\d+");

                if (s.equals("M") || s.equals("L")) {
                    arr[0]++;
                } else if (s.equals("S")) {
                    arr[3]++;
                } else if (isNumber && Integer.parseInt(s) >= 12) {
                    arr[1]++;
                } else if (isNumber && Integer.parseInt(s) < 12) {
                    arr[2]++;
                } else {
                    arr[4]++;
                }
            }

            for (int i=0; i<5; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}