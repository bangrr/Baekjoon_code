import java.io.*;
import java.util.*;

public class Bj_34998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String str = br.readLine();
            if (str.contains("!")) {
                sb.append("!");
            } else {
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch >= '1' && ch <= '9') {
                        sum += ((int)ch-'0');
                    }
                }
                if (sum > 9) {
                    sb.append("!");
                } else {
                    sb.append(sum);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}