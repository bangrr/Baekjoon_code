import java.io.*;
import java.util.*;

public class Bj_4597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (Objects.equals(str, "#")) {
                break;
            }

            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                }
            }
            if (str.charAt(str.length() - 1) == 'e') {
                sb.append(str.replace("e", cnt % 2 == 0 ? "0" : "1"));
            } else if (str.charAt(str.length() - 1) == 'o') {
                sb.append(str.replace("o", cnt % 2 == 1 ? "0" : "1"));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}