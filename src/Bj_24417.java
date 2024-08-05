import java.io.*;
import java.util.*;

public class Bj_24417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int MOD = 1000000007;

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i=2; i<=n; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }
        System.out.print((c % MOD) + " " + (n - 2));
    }
}