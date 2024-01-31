import java.util.Scanner;

public class Bj_2355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println((a+b)*(Math.abs(a-b)+1)/2);
		sc.close();
	}
}