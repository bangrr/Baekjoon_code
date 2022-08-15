import java.util.*;

public class Bj_20492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res1 = n*78/100;
		int res2 = n*80/100 + n*20/100*78/100;
		System.out.println(res1 + " " + res2);
		sc.close();
	}
}