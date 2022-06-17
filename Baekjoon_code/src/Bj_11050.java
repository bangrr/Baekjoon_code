import java.util.Scanner;

public class Bj_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = 1;
		
		for (int i=n; i>(n-k); i--) {
			r = r * i;
		}
		for (int i=1; i<=k; i++) {
			r = r / i;
		}
		System.out.println(r);
		sc.close();
	}
}
