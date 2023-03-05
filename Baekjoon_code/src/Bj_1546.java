import java.util.Scanner;

public class Bj_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max = 0;
		int sum = 0;
		
		for (int j=0; j<n; j++) {
			int tmp = sc.nextInt();
			if (max < tmp) {
				max = tmp;
			}
			sum += tmp;
		}
		
		System.out.println(sum*100.0/max/n); // 100.0 을 곱하면서 double을 만든다
		sc.close();
	}
}