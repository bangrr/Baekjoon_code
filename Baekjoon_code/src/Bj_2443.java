import java.util.Scanner;

public class Bj_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		
		while (n > 0) {
			System.out.println(" ".repeat(r++) + "*".repeat(2*n---1));
		}
		sc.close();
	}
}
