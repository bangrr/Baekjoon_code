import java.util.*;

public class Bj_15964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		System.out.print((a+b)*(a-b));
		sc.close();
	}
}