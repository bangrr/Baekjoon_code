import java.math.*;
import java.util.*;

public class Bj_13277 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		System.out.print(a.multiply(b));
		sc.close();
	}
}