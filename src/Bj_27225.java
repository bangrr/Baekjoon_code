import java.io.*;
import java.util.*;

public class Bj_27225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int min;
        if (n > m) {
            min = m;
            System.out.print(min * 2 + ((n - min) % 2 == 1 ? 1 : 0));
        } else {
            min = n;
            System.out.print(min * 2 + ((m - min) % 2 == 1 ? 1 : 0));
        }
    }
}