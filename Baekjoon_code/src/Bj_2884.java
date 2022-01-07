import java.util.Scanner;

public class Bj_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		if (m < 45) {
			m = (m - 45) + 60;
			if (h == 0) {
				h = (h - 1) +24;
			} else {
				h = h - 1;
			}
		} else {
			m = m - 45;
		}
		System.out.printf("%d %d", h, m);
	}
}
