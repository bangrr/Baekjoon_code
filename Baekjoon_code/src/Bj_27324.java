import java.util.Scanner;

public class Bj_27324 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n/10 == n%10) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		sc.close();
	}
}