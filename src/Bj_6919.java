import java.io.*;
import java.util.*;

public class Bj_6919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int a = n / m;
        n = n % m;
        int gcd = 1;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        n /= gcd;
        m /= gcd;

        if (n == 0) {
            System.out.print(a);
        } else if (a == 0) {
            System.out.print(n + "/" + m);
        }else {
            System.out.print(a + " " + n + "/" + m);
        }
    }
}
