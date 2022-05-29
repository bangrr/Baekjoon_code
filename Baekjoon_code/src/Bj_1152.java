import java.util.Scanner;

public class Bj_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		sc.close();

		int cnt = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}
		if (str.equals("")) {
			cnt = 0;
		}
		System.out.print(cnt);
	}
}
 