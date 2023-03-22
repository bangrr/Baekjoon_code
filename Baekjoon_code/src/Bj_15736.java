import java.util.Scanner;

public class Bj_15736 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		boolean[] b = new boolean[n+1];
//		
//		for (int i=1; i<=n; i++) {
//			for (int j=i; j<=n; j+=i) {
//				if (b[j]) {
//					b[j] = false;
//				} else {
//					b[j] = true;
//				}
//			}
//		}
//		
//		int a = 0;
//		for (int i=1; i<=n; i++) {
//			if (b[i]) a++;
//		}
//
//		System.out.println(a);
		System.out.print((int)Math.sqrt(n));
		sc.close();
	}
}