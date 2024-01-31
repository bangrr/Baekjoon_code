import java.util.Scanner;

public class Bj_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m;
		sc.close();
		
		for (m=1; m<=n; m++) {			
			int sum = 0;
			int tmp = m;
			sum += tmp;
			while (tmp>0) {
				sum = sum + tmp%10;
				tmp/=10;
			}
			if (sum == n) {
				System.out.println(m);
				break;
			} else if (m == n) {
				System.out.println(0);
			}
		}
	}
}
