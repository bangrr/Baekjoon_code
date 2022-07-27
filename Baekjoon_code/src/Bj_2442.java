import java.util.*;

public class Bj_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 1;
		
		while (n > 0) {
			System.out.println(" ".repeat(n---1) + "*".repeat(2*r++-1));
		}
		sc.close();
	}
}
