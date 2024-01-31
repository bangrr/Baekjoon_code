import java.util.Scanner;

public class Bj_25704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int ans = 0;
		
		if (n < 5) {
			ans = p;
		}
		if (n >= 5) {
			ans = p - 500;
		}
		if (n >= 10) {
			ans = Math.min(ans, p - p / 10);
		}
		if (n >= 15) {
			ans = Math.min(ans, p - 2000);
		}
		if (n >= 20) {
			ans = Math.min(ans, p - p / 4);
		}
		if (ans < 0) {
			ans = 0;
		}
		
		System.out.println(ans);
		sc.close();
	}
}