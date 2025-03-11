import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_24228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger r = new BigInteger(st.nextToken());
        System.out.print(r.multiply(BigInteger.TWO).add(n).subtract(BigInteger.ONE));
    }
}