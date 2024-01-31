import java.util.Scanner;

public class Bj_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int max=0;
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					if (a[i] + a[j] + a[k] <= m && a[i] + a[j] + a[k] > max) {
						max = a[i] + a[j] + a[k];
					}
				}
			}
		}
		System.out.println(max);
	}
}
