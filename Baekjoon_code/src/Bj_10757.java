import java.math.BigInteger;
import java.util.Scanner;

public class Bj_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger bn1 = new BigInteger(sc.next());
		BigInteger bn2 = new BigInteger(sc.next());
		
		System.out.println(bn1.add(bn2));
		sc.close();
	}
}
