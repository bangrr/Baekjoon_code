import java.io.*;
import java.util.*;

public class Bj_6321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            String s = br.readLine();
            sb.append("String #").append(i).append("\n");
            for (int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'Z') {
                    sb.append("A");
                } else {
                    sb.append((char)(s.charAt(j)+1));
                }
            }
            sb.append("\n\n");
        }
        System.out.print(sb);
    }
}