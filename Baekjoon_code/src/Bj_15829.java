import java.util.Scanner;

public class Bj_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		int m = 1234567891;
		
		long r=1;
		long sum=0;
		
		for (int i=0; i<l; i++) {
			sum += (s.charAt(i)-96)*r;
			r = r*31%m;
		}
		System.out.println(sum%m);
		sc.close();
	}
}