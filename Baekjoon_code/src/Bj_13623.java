import java.util.Scanner;

public class Bj_13623 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		char ans = '\0';
		
		if (a==b & b==c) {
			ans = '*';
		} else if (a==b & b!=c) {
			ans = 'C';
		} else if (b==c & a!=b) {
			ans = 'A';
		} else if (a==c & a!=b) {
			ans = 'B';
		}
		System.out.println(ans);
		sc.close();
	}
}