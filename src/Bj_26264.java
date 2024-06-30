import java.io.*;
import java.util.*;

public class Bj_26264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                String tmp = str.substring(i, i+8);
                if (Objects.equals("security", tmp)) {
                    cnt++;
                    i+=7;
                }
            } else if (str.charAt(i) == 'b') {
                String tmp = str.substring(i, i+7);
                if (Objects.equals("bigdata", tmp)) {
                    cnt--;
                    i+=6;
                }
            }
        }
        System.out.print(cnt > 0 ? "security!" : cnt < 0 ? "bigdata?" : "bigdata? security!");
    }
}