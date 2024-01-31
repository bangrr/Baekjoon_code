import java.util.*;

public class Bj_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int x = 0;
		
		long[] a = new long[k+1];
		long[] s = new long[k+1];
		for (int i=1; i<=k; i++) {
			a[++x] = sc.nextLong();
			if (a[x] != 0) {
				s[i] = s[i-1] + a[x];
			} else {
				s[i] = s[i-1] - a[--x];
				x--;
			}
		}
		System.out.print(s[s.length-1]);
		sc.close();
	}
}