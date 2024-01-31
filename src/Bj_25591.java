import java.util.*;

public class Bj_25591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a, b, c, d, q, r;
		
		a = 100 - x;
		b = 100 - y;
		c = 100 - (a+b);
		d = a*b;
		q = d/100;
		r = d%100;
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println(q+c + " " + r);
		sc.close();
	}
}