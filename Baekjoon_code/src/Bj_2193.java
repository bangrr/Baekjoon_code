import java.util.Scanner;
 
public class Bj_2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		long a = 0;
		long b = 1;
		long c = 1;
 
		for (int i=2; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
        System.out.println(c);
		sc.close();
	}
}