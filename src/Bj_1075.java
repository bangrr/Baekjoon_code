import java.util.Scanner;

public class Bj_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		n = n / 100 * 100;
		if (n/f * f < n) {
			n = n + (f-n%f);
		}
		String s = Integer.toString(n);
		System.out.print(s.substring(s.length()-2));
		sc.close();
	}
}