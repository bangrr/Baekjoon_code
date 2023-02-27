import java.util.Scanner;

public class Bj_5565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=sc.nextInt();
		for (int i=0; i<9; i++) {
			ans -= sc.nextInt();
		}
		System.out.println(ans);
		sc.close();
	}
}