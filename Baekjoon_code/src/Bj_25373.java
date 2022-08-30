import java.util.*;

public class Bj_25373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		
		if (n <= 1) {
			ans = 1;
		} else if (n <= 3) {
			ans = 2;
		} else if (n <= 6) {
			ans = 3;
		} else if (n <= 10) {
			ans = 4;
		} else if (n <= 15) {
			ans = 5;
		} else if (n <= 21) {
			ans = 6;
		} else if (n <= 28) {
			ans = 7;
		} else if (n > 28) {
			ans = (n-29) / 7 + 8;
		}
		
		System.out.println(ans);
		sc.close();
	}
}