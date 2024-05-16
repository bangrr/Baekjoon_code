import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        BigInteger ans = BigInteger.ONE;
        for (BigInteger k = BigInteger.ONE; m.subtract(k).compareTo(BigInteger.ZERO)>=0; k = k.add(BigInteger.ONE)) {
            ans = ans.multiply(n.subtract(k).add(BigInteger.ONE));
            if (ans.mod(k).compareTo(BigInteger.ZERO) == 0) {
                ans = ans.divide(k);
            }
        }
        System.out.print(ans);
    }
}