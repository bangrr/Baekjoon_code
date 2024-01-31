import java.util.*;

public class Bj_14489 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b>=2*c) {
			System.out.print(a+b-(2*c));
		} else {
			System.out.print(a+b);
		}
		sc.close();
	}
}