import java.util.*;

public class Bj_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<2*n-1; i++) {
			if (i<n) {
				System.out.println(" ".repeat(i) + "*".repeat(2*(n-i)-1));
			} else {
				System.out.println(" ".repeat(2*(n-1) - i) + "*".repeat(2*(i-n)+3));
			}
		}
		sc.close();
	}
}