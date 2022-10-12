import java.util.Scanner;

public class Bj_17388 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		String str = "";
		
		if (s+k+h >= 100) {
			str = "OK";
		} else if (s < Math.min(k, h)) {
			str = "Soongsil";
		} else if (k < Math.min(s, h)) {
			str = "Korea";
		} else if (h < Math.min(s, k)) {
			str = "Hanyang";
		}
		System.out.print(str);
		sc.close();
	}
}