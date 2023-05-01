import java.util.Scanner;

public class Bj_27907 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			sb.append(2).append(" ");
		}
		System.out.print(sb.toString());
	}
}