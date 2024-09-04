import java.io.*;
import java.util.*;

public class Bj_13600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] fac = new int[10];
        int f = 1;
        for (int i = 1; i < 10; i++) {
            fac[i] = f *= i;
        }

        int ans = 0;
        for (int i = fac.length - 1; i >= 0; i--) {
            if (n > 0) {
                ans += n / fac[i];
                n %= fac[i];
            }
        }
        System.out.print(ans);
    }
}