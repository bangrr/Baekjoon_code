import java.util.*;

public class Bj_25238 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.println((a -= a*b/100) < 100 ? 1 : 0);
		sc.close();
	}
}