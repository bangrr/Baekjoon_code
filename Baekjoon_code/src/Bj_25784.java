import java.util.*;

public class Bj_25784 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if (a[0]+a[1]==a[2]) {
			System.out.print(1);
		} else if (a[0]*a[1]==a[2]) {
			System.out.print(2);
		} else {
			System.out.print(3);
		}
		sc.close();
	}
}