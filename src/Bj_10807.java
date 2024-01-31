import java.util.Scanner;

public class Bj_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i=0; i<n; i++) {
			if (a[i] == v) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
