import java.util.Scanner;

public class Bj_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;

		dan = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
