import java.util.Scanner;

public class Bj_15552_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			sb.append(sc.nextInt() + sc.nextInt() + "\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
