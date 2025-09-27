import java.io.*;
import java.util.*;

public class Bj_11094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            if (s.startsWith("Simon says")) {
                sb.append(s.substring(10)).append("\n");
            }
        }
        System.out.print(sb);
    }
}