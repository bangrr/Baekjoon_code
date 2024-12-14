import java.io.*;
import java.util.*;

public class Bj_5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String line;
        while (!"*".equals(line = br.readLine())) {
            int[] arr = new int[26];
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                    arr[line.charAt(i) - 'a']++;
                }
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (arr[i] == 0) {
                    flag = false;
                    break;
                }
            }
            sb.append(flag ? "Y" : "N").append("\n");
        }
        System.out.print(sb);
    }
}
