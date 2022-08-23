import java.util.*;
import java.io.*;

public class Bj_25495 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int b = 0;
		int c = 1;
		boolean d = false;
		
		a[0] = sc.nextInt();
		b = 2;
		
		for (int i=1; i<n; i++) {
			a[i] = sc.nextInt();
			if (a[i-1] != a[i]) {
				b += 2;
				c = 1;
				d = false;
			} else if (a[i-1] == a[i] && d) {
				b += 2;
				c = 1;
				d = false;
			} else if (a[i-1] == a[i]) {
				c = c*2;
				b = b + 2*c;
			}
			if (b >= 100) {
				b = 0;
				c = 1;
				d = true;
			}
		}
		System.out.print(b);
		sc.close();
	}
}