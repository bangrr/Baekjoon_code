import java.io.*;
import java.util.*;

public class Bj_33528 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        for (int i=0; i<26; i++) {
            for (int j=0; j<str.length(); j++) {
                sb.append((str.charAt(j) - i) < 65 ? (char)(str.charAt(j) - i + 26) : (char)(str.charAt(j) - i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}