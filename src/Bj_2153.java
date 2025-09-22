import java.io.*;
import java.util.*;

public class Bj_2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') sum += s.charAt(i) - 'A' + 27;
            else sum += s.charAt(i) - 'a' + 1;
        }

        System.out.print(isPrime(sum) ? "It is a prime word." : "It is not a prime word.");
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}