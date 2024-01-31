import java.util.*;

public class Bj_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 665;
		while (n > 0) {
			if (String.valueOf(++ans).contains("666")) {
				n--;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}