import java.util.Arrays;
import java.util.Scanner;

public class Bj_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[30];
		Arrays.fill(a, 0);
		
		for (int i=0; i<28; i++) {
			int n = sc.nextInt();
			a[n-1] = n;
		}
		for (int i=0; i<30; i++) {
			if (a[i] == 0) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
}
