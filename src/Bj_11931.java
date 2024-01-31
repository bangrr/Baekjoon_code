import java.util.*;

public class Bj_11931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, (i1, i2) -> i2 - i1);
		for (int i=0; i<n; i++) {
			sb.append(a[i] + "\n");
		}
		System.out.println(sb);
		sc.close();
	}
}