import java.io.*;
import java.util.*;

public class Bj_5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((int) c - 3 < 65) {
                sb.append((char)(c + 26 - 3));
            } else {
                sb.append((char)(c - 3));
            }
        }
        System.out.print(sb);
    }
}
