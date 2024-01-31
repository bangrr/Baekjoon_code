import java.util.Scanner;

public class Bj_9012 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int T = sc.nextInt();
		String str;
		
		for(int i=0; i<T; i++) {
			str = sc.next();
			if (str.charAt(0)=='(') {
				int cnt1=0, cnt2=0;
				for (int j=0; j<str.length(); j++) {
					if (str.charAt(j) == '(') {
						cnt1++;
					} else if (str.charAt(j) == ')') {
						cnt2++;
					}
					if (cnt2>cnt1) {
						break;	// ')' 가 '(' 보다 많아지면 no
					}
				}
				if (cnt1==cnt2) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
