import java.util.Scanner;

public class Bj_2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int p = sc.nextInt();
		int su = l * p;
		
		for (int i=0; i<5; i++) {
			System.out.print(sc.nextInt() - su + " ");
		}
		sc.close();
	}
}