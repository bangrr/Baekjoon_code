import java.math.BigInteger;
import java.util.Scanner;

public class Bj_2935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ai = new BigInteger(sc.next());
		char c = sc.next().charAt(0);
		BigInteger bi = new BigInteger(sc.next());
		if (c == '*') {
			System.out.print(ai.multiply(bi));
		} else {
			System.out.print(ai.add(bi));
		}
	}
}