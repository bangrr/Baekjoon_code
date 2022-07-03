import java.util.Scanner;

public class Bj_25314 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n/4; i++) {
			sb.append("long ");
		}
		sb.append("int");
		System.out.println(sb);
		sc.close();
	}
}
