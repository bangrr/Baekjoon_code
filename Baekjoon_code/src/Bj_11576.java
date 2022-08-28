import java.util.*;

public class Bj_11576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<m; i++) {
			sum = sum + (int)Math.pow(a, m-1-i)*sc.nextInt();
		}
		
		int tb = 1;
		while (tb <= sum) {
			tb = tb*b;
		}
		
		while (sum > 0) {
			tb = tb/b;
			sb.append(sum/tb + " ");
			sum = sum%tb;
		}
		tb = tb/b;
		while (tb > 0) {
			tb = tb/b;
			sb.append(0 + " ");
		}
		System.out.println(sb);
		sc.close();
	}
}