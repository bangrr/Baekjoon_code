import java.util.Scanner;

public class Bj_17874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		int v = sc.nextInt();
		
		System.out.println(Math.max(h, n-h)*Math.max(v, n-v)*4);
		sc.close();
	}
}