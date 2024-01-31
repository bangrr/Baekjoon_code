import java.util.*;

public class Bj_6840 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		Arrays.sort(a);
		System.out.print(a[1]);
		sc.close();
	}
}