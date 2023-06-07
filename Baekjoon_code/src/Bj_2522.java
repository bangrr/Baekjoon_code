import java.util.Scanner;

public class Bj_2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		for (int i=1; i<=n*2-1; i++) {
			if (i <= n) {
				sb.append(" ".repeat(n-i)).append("*".repeat(i)).append("\n");
			} else {
				sb.append(" ".repeat(i-n)).append("*".repeat(n*2-i)).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}