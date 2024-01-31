import java.util.Scanner;

public class Bj_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		String str = "";

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) {
				str = str + a[i] + " ";
			}
		}
		sc.close();
		System.out.println(str);
	}
}
