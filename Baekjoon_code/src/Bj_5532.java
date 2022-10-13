import java.util.*;

public class Bj_5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int ans = 0;
		
		if (A%C != 0) {
			A = A/C+1;
		} else {
			A = A/C;
		}
		if (B%D != 0) {
			B = B/D+1;
		} else {
			B = B/D;
		}
		
		ans = L - Math.max(A, B);
		
		System.out.print(ans);
		sc.close();
	}
}