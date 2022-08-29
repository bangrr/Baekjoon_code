import java.util.*;

public class Bj_17554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] flag = new boolean[n+1];
		Arrays.fill(flag, true);
		
		int ans = 0;
		int cnt = 0;
		for (int i=1; i<=k; i++) {
			int m = sc.nextInt();
			for (int j=1; j*m<=n; j++) {
				if (flag[j*m]) {
					flag[j*m] = false;
					cnt++;
				} else {
					flag[j*m] = true;
					cnt--;
				}
			}
			if (ans < cnt) {
				ans = cnt;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}