import java.util.*;

public class Bj_8545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i=2; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		sc.close();
	}
}