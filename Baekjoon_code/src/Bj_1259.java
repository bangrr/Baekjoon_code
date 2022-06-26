import java.util.Scanner;

public class Bj_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}
			String s = String.valueOf(a);
			int cnt=0;
			for (int i=0; i<s.length(); i++) {
				if (String.valueOf(a).charAt(i) != String.valueOf(a).charAt(s.length()-1-i)) {
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}
