import java.math.*;
import java.util.*;

public class Bj_10827 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		BigDecimal x = new BigDecimal(a);
		int b = sc.nextInt();
		BigDecimal y = new BigDecimal(1);
		
		for (int i=0; i<b; i++) {
			y = y.multiply(x);
		}
		System.out.print(y.toPlainString());
		sc.close();
	}
}