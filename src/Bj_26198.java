import java.io.*;
import java.util.*;

public class Bj_26198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'I') {
                    sum += 1;
                } else if (ch == 'V') {
                    sum += 5;
                } else if (ch == 'X') {
                    sum += 10;
                } else if (ch == 'L') {
                    sum += 50;
                } else if (ch == 'C') {
                    sum += 100;
                } else if (ch == 'D') {
                    sum += 500;
                } else if (ch == 'M') {
                    sum += 1000;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}