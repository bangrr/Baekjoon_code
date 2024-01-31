import java.util.Scanner;

public class Bj_2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (int) Math.pow(2, sc.nextInt()) + 1;
		System.out.print(n * n);
		sc.close();
	}
}