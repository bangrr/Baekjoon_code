import java.io.*;
import java.util.*;

public class Bj_16861 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = n; i <= 1000000000; i++) {
            String s = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Integer.parseInt(s.substring(j, j + 1));
            }
            if (i % sum == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}