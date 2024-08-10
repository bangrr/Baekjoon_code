import java.io.*;
import java.util.*;

public class Bj_5988 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int k = s.charAt(s.length() - 1) - '0';
            sb.append(k % 2 == 0 ? "even\n" : "odd\n");
        }
        System.out.print(sb);
    }
}