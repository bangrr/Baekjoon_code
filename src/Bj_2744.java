import java.util.*;

public class Bj_2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		
		for (int i=0; i<s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				sb.append(Character.toUpperCase(s.charAt(i)));
			} else {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.print(sb);
		sc.close();
	}
}