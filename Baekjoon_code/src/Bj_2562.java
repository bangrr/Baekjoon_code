import java.util.Scanner;

public class Bj_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		
		int max = 0;
		int idx = 0;
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if (max < a[i]) {
				max = a[i];
				idx = i+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(idx);
	}
}
