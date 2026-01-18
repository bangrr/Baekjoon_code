import java.io.*;
import java.util.*;

public class Bj_10203 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                    cnt++;
                }
            }
            sb.append("The number of vowels in ").append(s).append(" is ").append(cnt).append(".").append("\n");
        }
        System.out.print(sb);
    }
}