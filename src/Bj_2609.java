import java.util.Scanner;

public class Bj_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i=(a<b?a:b); i>0; i--) {
			if (a%i==0 && b%i==0) {
				System.out.println(i);
				System.out.println(i*(a/i)*(b/i));
				break;
			}
		}
		sc.close();
	}
}
