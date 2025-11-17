import java.io.*;
import java.util.*;

public class Bj_34750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = 0, b = 0;
        if (n >= 1000000) {
            a = n / 100 * 20;
            b = n / 100 * 80;
        } else if (n >= 500000) {
            a = n / 100 * 15;
            b = n / 100 * 85;
        } else if (n >= 100000) {
            a = n / 100 * 10;
            b = n / 100 * 90;
        } else {
            a = n / 100 * 5;
            b = n / 100 * 95;
        }
        System.out.print(a + " " + b);
    }
}