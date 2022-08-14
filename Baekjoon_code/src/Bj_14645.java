import java.util.*;

public class Bj_14645 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			k = k + sc.nextInt() - sc.nextInt();
		}
		System.out.print("비와이");
		sc.close();
	}
}