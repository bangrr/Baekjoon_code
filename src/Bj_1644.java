import java.io.*;
import java.util.*;

public class Bj_1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeList = new ArrayList<>();
        boolean notPrime[] = new boolean[n+1];

        for (int i=2; i*i<=n; i++) {
            if (!notPrime[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    notPrime[j] = true;
                }
            }
        }

        // 소수를 List에 저장
        for (int i=2; i<=n; i++) {
            if (!notPrime[i]) {
                primeList.add(i);
            }
        }

        int ans = 0;
        for (int i=0; i<primeList.size(); i++) {
            int sum = 0;
            for (int j=i; j<primeList.size(); j++) {
                sum += primeList.get(j);
                if (sum < n) continue;
                if (sum == n) ans++;
                break;
            }
        }
        System.out.print(ans);
    }
}