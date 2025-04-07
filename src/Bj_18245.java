import java.io.*;
import java.util.*;

public class Bj_18245 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        int k = 1;
        while ((s = br.readLine()) != null) {
            if (s.equals("Was it a cat I saw?")) {
                break;
            }
            ++k;
            for (int i = 0; i < s.length(); i+=k) {
                sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}