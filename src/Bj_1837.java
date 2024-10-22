import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        BigInteger bp = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] notPrimes = new boolean[k+1];
        notPrimes[0] = notPrimes[1] = true;
        for (int i = 2; i*i <= k; i++) {
            if (notPrimes[i]) continue;
            for (int j = i*i; j <= k; j += i) {
                notPrimes[j] = true;
            }
        }

        BigInteger res = new BigInteger("0");
        for (int i = 2; i < k; i++) {
            if (notPrimes[i]) continue;
            BigInteger bk = new BigInteger(String.valueOf(i));
            if (bp.mod(bk).equals(BigInteger.ZERO)) {
                res = bk;
                break;
            }
        }

        if (res.equals(BigInteger.ZERO)) {
            sb.append("GOOD");
        } else {
            sb.append("BAD ").append(res);
        }
        System.out.print(sb);
    }
}