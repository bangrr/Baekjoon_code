import java.io.*;
import java.util.*;

public class Bj_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            int sum = s.length()+1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    sum += 4;
                } else if (c == '1') {
                    sum += 2;
                } else {
                    sum += 3;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}