import java.math.BigInteger;
import java.util.Scanner;

public class Bj_26711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(new BigInteger(sc.next()).add(new BigInteger(sc.next())));
		sc.close();
	}
}