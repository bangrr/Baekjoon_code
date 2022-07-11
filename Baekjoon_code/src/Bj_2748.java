import java.util.Scanner;

public class Bj_2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long a = 0;
		long b = 1;
		long c = a+b;
		
		for (int i=2; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
        System.out.println(c);
		sc.close();
	}
}
