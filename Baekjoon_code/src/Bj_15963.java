import java.util.Scanner;

public class Bj_15963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if (a==b) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		sc.close();
	}
}