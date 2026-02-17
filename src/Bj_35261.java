import java.io.*;
import java.util.*;

public class Bj_35261 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = new char[]{'e', 'a', 'g', 'l', 'e'};
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int max = 0;
        for (int i = 0; i <= n - 5; i++) {
            int tmp = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j] == s.charAt(i + j)) tmp++;
            }
            max = Math.max(max, tmp);
        }
        System.out.print(5 - max);
    }
}