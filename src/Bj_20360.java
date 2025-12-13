import java.io.*;
import java.util.*;

public class Bj_20360 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String b = Integer.toBinaryString(n);
        int len = b.length();
        for (int i = len-1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                sb.append(len-1-i).append(" ");
            }
        }
        System.out.print(sb);
    }
}