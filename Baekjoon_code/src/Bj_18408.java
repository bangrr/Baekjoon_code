import java.util.*;

public class Bj_18408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
		if (sum < 5) {
			System.out.print(1);
		} else {
			System.out.print(2);
		}
		sc.close();
	}
}