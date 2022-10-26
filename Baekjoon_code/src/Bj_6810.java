import java.util.Scanner;

public class Bj_6810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ans = 91 + a + b*3 + c;
		System.out.print("The 1-3-sum is " + ans);
		sc.close();
	}
}