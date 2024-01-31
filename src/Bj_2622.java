import java.util.*;

public class Bj_2622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i=1; i<=n/3; i++) {
			for (int j=i; j<=n-i-j; j++) {
				if (i+j>(n-i-j)) {
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		sc.close();
	}
}