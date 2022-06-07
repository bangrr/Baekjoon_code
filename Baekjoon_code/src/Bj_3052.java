import java.util.Scanner;

public class Bj_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int cnt=1;
		
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt()%42;
		}
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i] == a[j]) {
					break;
				}
				if (j == 9) {
					cnt++;
				}
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}
