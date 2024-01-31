import java.util.*;

public class Bj_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int[] a = new int[9];
		
		for (int i=0; i<n.length(); i++) {
			if (n.charAt(i)-48 == 9) {
				a[n.charAt(i)-51]++;
			} else {
				a[n.charAt(i)-48]++;
			}
		}
		a[6] = a[6] % 2 == 0 ? a[6]/2 : a[6]/2+1;
		Arrays.sort(a);
		System.out.print(a[a.length-1]);
		sc.close();
	}
}