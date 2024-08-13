import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_4375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            BigInteger bi = BigInteger.ONE;
            while (true) {
                if (bi.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                    sb.append(String.valueOf(bi).length()).append("\n");
                    break;
                }
                bi = bi.multiply(BigInteger.TEN).add(BigInteger.ONE);
            }
        }
        System.out.print(sb);
    }
}