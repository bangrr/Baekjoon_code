import java.io.*;
import java.util.*;

public class Bj_26314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if ("aeiou".contains(String.valueOf(c))) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
            sb.append(str).append("\n");
            sb.append(cnt > 0 ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}