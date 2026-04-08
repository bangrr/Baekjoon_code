import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_30664 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger n;
        while (!(n = new BigInteger(br.readLine())).equals(BigInteger.ZERO)) {
            sb.append(n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO) ? "PREMIADO\n" : "TENTE NOVAMENTE\n");
        }
        System.out.print(sb);
    }
}