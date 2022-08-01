import java.util.*;

public class Bj_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sp = 1;
		int ep = 1;
		int cnt = 1;
		int sum = 1;
		
		while(ep != n) {
			if (sum == n) {
				cnt++;
				ep++;
				sum += ep;
			} else if (sum > n) {
				sum -= sp;
				sp++;
			} else {
				ep++;
				sum += ep;
			}
		}
		System.out.print(cnt);
		sc.close();
	}
}