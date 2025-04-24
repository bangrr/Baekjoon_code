import java.io.*;
import java.math.BigInteger;

public class Bj_5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        BigInteger bi = new BigInteger(str, 2);
        bi = bi.multiply(new BigInteger("17"));
        System.out.print(bi.toString(2));
    }
}