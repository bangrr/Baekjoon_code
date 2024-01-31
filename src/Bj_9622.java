import java.util.*;

public class Bj_9622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		int t = sc.nextInt();
		while(t-- > 0) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			if (((a <= 56 && b <= 45 && c <= 25) || a+b+c <= 125) && d <= 7) {
				sb.append("1\n");
				cnt++;
			} else {
				sb.append("0\n");
			}
		}
		sb.append(cnt);
		System.out.print(sb);
		sc.close();
	}
}