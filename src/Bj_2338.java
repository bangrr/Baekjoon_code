import java.math.BigInteger;
import java.util.Scanner;

public class Bj_2338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger biA = new BigInteger(a);
		BigInteger biB = new BigInteger(b);
		
		System.out.println(biA.add(biB));
		System.out.println(biA.subtract(biB));
		System.out.println(biA.multiply(biB));
		sc.close();
	}
}
