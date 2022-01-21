import java.util.Scanner;

public class Bj_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int cnt = 1;
		int sum = 1;
		while (true) {
			if (n == sum) {
				break;
			} else if (n > sum) {
				cnt++;
				sum += ((cnt - 1) * 6);
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}

/*
 * 
 *
 * cnt = 1 일때 (cnt-1)*6 + 1 까지는 1 cnt * 6 + 1 까지는 2 cnt
 * 
 * 
 * for (int i = 0; ((i-1)*6 + 1 < n && n <= i*6 + 1); i++) { result++;
 * 
 * }
 * 
 * 1 = 1 
 * 2 = 1 + 1 
 * 7 = 1 + 6 
 * 8 = 1 + 6 + 1 
 * 19 = 1 + 6 + 12
 * 
 * 0*1*6 + 1
 * 1*1*6 + 1
 * 3*6 + 1
 * 6*6 + 1
 * 
 * (i-1)*6 + 1 < n <= i*6 + 1;
 */