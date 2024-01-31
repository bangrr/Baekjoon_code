import java.math.BigInteger;
import java.util.*;

public class Bj_8437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		BigInteger bs = new BigInteger(s);
		String c = sc.next();
		BigInteger bc = new BigInteger(c);
		BigInteger ba = bs.subtract(bc).divide(new BigInteger("2"));
		System.out.println(ba.add(bc));
		System.out.println(ba);
		sc.close();
	}
}