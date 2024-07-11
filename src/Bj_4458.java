import java.io.*;
import java.util.*;

public class Bj_4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            sb.append(s.charAt(0) > 'Z' ? (char)(s.charAt(0)-32) : (char)s.charAt(0));
            sb.append(s.substring(1)).append("\n");
        }
        System.out.print(sb);
    }
}