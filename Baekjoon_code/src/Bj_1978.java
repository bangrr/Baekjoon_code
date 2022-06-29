import java.util.Scanner;

public class Bj_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = n;
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if (a==1) {
				cnt--;
			}
			for (int j=2; j<a; j++) {
				if (a%j == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
