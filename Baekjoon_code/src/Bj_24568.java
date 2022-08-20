import java.math.BigInteger;
import java.util.*;

public class Bj_24568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger r = new BigInteger(sc.next());
		BigInteger s = new BigInteger(sc.next());
		BigInteger e = new BigInteger("8");
		BigInteger t = new BigInteger("3");
		BigInteger c = new BigInteger("28");
		
		System.out.println(r.multiply(e).add(s.multiply(t)).subtract(c));
		sc.close();
	}
}