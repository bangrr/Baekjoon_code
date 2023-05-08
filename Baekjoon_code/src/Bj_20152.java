import java.io.*;
import java.util.*;

public class Bj_20152 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int h, n, m;
	static long ans;
	static long[][] memo;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		dp();
		solve();
	}
	
	/* 0 - 1 = 1
	 * 1 - 1 = 1
	 * 2 - 1 + 1 = 2 
	 * 3 - 1 + 2 + 2 = 5
	 * 4 - 1 + 3 + 5 + 5 = 14
	 * 5 - 1 + 4 + 9 + 14 + 14 = 42
	 * 6 - 1 + 5 + 14 + 28 + 42 + 42 = 132
	 * 
	 */
	static void dp() {
		m = Math.abs(h-n);
		if (m == 0) {
			ans = 1;
			return;
		}
		memo = new long[m+1][m+1];
		memo[0][1] = 1;
		memo[1][1] = 1;
		for (int i=2; i<=m; i++) {
			for (int j=1; j<m; j++) {
				for (int k=j; k>=1; k--) {
					memo[i][j] += memo[i-1][k];
				}
			}
			memo[i][i] = memo[i][i-1];
		}
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
	}
	
	// 출력부
	static void solve() {
		for (int i=1; i<=m; i++) {
			ans += memo[m][i];
		}
		System.out.print(ans);
	}
}