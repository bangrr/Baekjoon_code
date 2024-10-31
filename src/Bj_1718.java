import java.io.*;
import java.util.*;

public class Bj_1718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] plain = br.readLine().toCharArray();
        String cypher = br.readLine();
        for (int i = 0; i < plain.length; i++) {
            char c = plain[i];
            int d = cypher.charAt(i % cypher.length()) - 96;
            if (c > 96) {
                int e = plain[i] - d;
                if (e < 97) e = e + 26;
                sb.append((char) e);
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}