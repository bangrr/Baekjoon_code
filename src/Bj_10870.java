import java.util.Scanner;

public class Bj_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		for (int i=2; i<=n; i++) {
			c = a + b;
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
