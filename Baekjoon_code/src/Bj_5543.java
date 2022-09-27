import java.util.*;

public class Bj_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int min1 = a < b ? a < c ? a : c : b < c ? b : c;
		int min2 = d < e ? d : e;
		System.out.print(min1 + min2 - 50);
		sc.close();
	}
}