import java.util.*;

public class Bj_25372 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		while (n-- > 0) {
			String s = sc.next();
			if (s.length()>=6 && s.length()<=9) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		System.out.print(sb);
		sc.close();
	}
}