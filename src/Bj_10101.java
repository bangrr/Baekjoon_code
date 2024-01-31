import java.util.*;

public class Bj_10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b+c == 180) {
			if (a == 60 && b == 60) {
				sb.append("Equilateral");
			} else if (a == b || b == c || a == c) {
				sb.append("Isosceles");
			} else {
				sb.append("Scalene");
			}
		} else {
			sb.append("Error");
		}
		System.out.println(sb);
		sc.close();
	}
}