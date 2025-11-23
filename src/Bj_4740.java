import java.io.*;
import java.util.*;

public class Bj_4740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("***")) break;

            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}