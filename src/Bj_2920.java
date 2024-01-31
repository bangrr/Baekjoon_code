import java.util.Scanner;

public class Bj_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[8];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt=0;
		for (int i=0; i<a.length; i++ ) {
			if (a[i] == i+1) {
				cnt++;
			} else if (a[i] == 8-i) {
				cnt--;
			}
		}
		if (cnt==8) {
			System.out.println("ascending");
		} else if (cnt==-8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
