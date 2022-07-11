import java.math.BigInteger;
import java.util.Scanner;

public class Bj_10826 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger a = new BigInteger("0");;
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");
		
		for (int i=2; i<=n; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		if (n==0) {
			System.out.println(a);
		} else if (n==1) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		sc.close();
	}
}
