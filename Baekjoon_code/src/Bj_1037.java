import java.util.*;

public class Bj_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] a = new int[c];
		for (int i=0; i<c; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]*a[c-1]);
		sc.close();
	}
}