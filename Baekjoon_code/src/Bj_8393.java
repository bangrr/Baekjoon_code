import java.util.Scanner;

public class Bj_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		sc.close();

		if (n >= 1 && n <= 10000) {
			for (int i = 0; i <= n; i++) {
				sum = sum+i;
			}
			System.out.print(sum);
		}
	}
}
