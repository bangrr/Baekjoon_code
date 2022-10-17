import java.util.Scanner;

public class Bj_10768 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		String s = null;
		if (m == 2 && d == 18) {
			s = "Special";
		} else if ((m == 2 && d < 18) || m < 2) {
			s = "Before";
		} else if ((m == 2 && d > 18) || m > 2) {
			s = "After";
		}
		System.out.print(s);
		sc.close();
	}
}