import java.util.*;

public class Bj_25915 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int a = c <'I' ? 84+'I'-c : 84+c-'I';
		System.out.print(a);
		sc.close();
	}
}