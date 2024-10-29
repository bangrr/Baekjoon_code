import java.io.*;
import java.util.*;

public class Bj_17870 {
    public static List<Integer> generatePrimes(int max) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            boolean flag = true;
            for (int su : primes) {
                if (su < i && i % su == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = 65536;
        List<Integer> primeList = generatePrimes(max);
        primeList.sort(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();
        while (n-- > 0) {
            long m = Long.parseLong(br.readLine());
            for (int prime : primeList) {
                if (m % prime == 0) {
                    treeSet.add(prime);
                    treeSet.add((int) (m/prime));
                    break;
                }
            }
        }

        int cnt = 0;
        for (int ans : treeSet) {
            sb.append(ans).append(++cnt % 5 == 0 ? "\n" : " ");
        }
        System.out.print(sb);
    }
}