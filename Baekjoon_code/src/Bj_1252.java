import java.math.BigInteger;
import java.util.Scanner;

public class Bj_1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sa = sc.next();
		String sb = sc.next();
		
		BigInteger a = new BigInteger(sa, 2);
		BigInteger b = new BigInteger(sb, 2);
		
		String ans = a.add(b).toString(2);
		System.out.println(ans);
		sc.close();
	}
}