import java.util.Scanner;

public class Bj_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0;
		int cnt=0;
		for (int i=0; i<n; i++) {
			String s = sc.next();
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j)=='O') {
					sum += ++cnt;
				} else if (s.charAt(j) == 'X') {
					cnt = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
			cnt = 0;
		}
		sc.close();
	}
}
