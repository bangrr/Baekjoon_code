import java.util.*;

public class Bj_25628 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a > 2*b ? b : a/2);
		sc.close();
	}
}