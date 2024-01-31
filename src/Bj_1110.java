import java.util.Scanner;

public class Bj_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0, cnt = 0;
		int tmp = n;

		while (true) {
			if (tmp == 0) {
				cnt++;
				System.out.print(cnt);
				break;
			} else if (tmp < 10) {
				res = tmp;
				tmp = tmp*10 + res;
			} else if (tmp < 100) {
				res = tmp/10 + tmp%10;
				tmp = (tmp%10)*10 + res%10;
			} else {
				break;
			}
			cnt++;
			if(tmp == n) {
				System.out.print(cnt);
				break;
			}
		}
		sc.close();
	}
}
