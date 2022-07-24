import java.util.*;

public class Bj_2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0, min = 99;
		for (int i=0; i<7; i++) {
			n = sc.nextInt();
			if (n % 2 != 0) {
				sum += n;
				min = min > n ? n : min;
			}
		}
		if (sum==0) {
			System.out.print(-1);
		} else {
			System.out.print(sum + "\n" + min);
		}
		sc.close();
	}
}