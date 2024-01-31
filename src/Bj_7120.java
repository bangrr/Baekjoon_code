import java.util.Scanner;

public class Bj_7120 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int p = 0;
		sb.append(s.charAt(0));
		for (int i=0; i<s.length(); i++) {
			if (i > 0 && s.charAt(p) != s.charAt(i)) {
				sb.append(s.charAt(i));
				p = i;
			}
		}
		System.out.print(sb.toString());
		sc.close();
	}
}