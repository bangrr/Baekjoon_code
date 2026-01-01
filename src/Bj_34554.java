import java.io.*;
import java.util.*;

public class Bj_34554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = getPrime();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (isPrime[n+1]) {
                sb.append(1).append("\n");
                sb.append(1).append(" ").append(n+1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static boolean[] getPrime() {
        boolean[] prime = new boolean[1000001];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i=2; i<=Math.sqrt(1000000); i++) {
            if (prime[i]) {
                for (int j=i*i; j<=1000000; j+=i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}