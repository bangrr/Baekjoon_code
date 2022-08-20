import java.math.*;
import java.util.*;

public class Bj_24309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		BigInteger c = new BigInteger(sc.next());
		
		System.out.println(b.subtract(c).divide(a));
		sc.close();
	}
}