import java.util.Scanner;

public class Bj_27328 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a>b?1:a<b?-1:0);
	}
}