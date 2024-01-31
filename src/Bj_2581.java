import java.util.Scanner;

public class Bj_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum=0;
		int min=10000;
		for (int i=n; i>=m; i--) {
			if (i>1) {
				for (int j=2; j<=i; j++) {
					if (i%j == 0) {
						if (j == i) {
							sum = sum + i;
							min = i;
						}
						break;
					}
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}
}
