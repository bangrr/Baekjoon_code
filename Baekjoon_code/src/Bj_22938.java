import java.util.*;
 
public class Bj_22938 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x1 = sc.nextInt();
		long y1 = sc.nextInt();
		long r1 = sc.nextInt();
		long x2 = sc.nextInt();
		long y2 = sc.nextInt();
		long r2 = sc.nextInt();
		long dd = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		if (dd < (r1+r2)*(r1+r2)) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}