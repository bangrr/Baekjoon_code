import java.io.*;
import java.util.*;

public class Bj_21734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            int sum = 0;
            while (ascii > 0) {
                sum += ascii % 10;
                ascii /= 10;
            }
            for (int j = 0; j < sum; j++) {
                sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}