import java.io.*;

public class Bj_17626 {
	static int[] memo;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		memo = new int[n+1];
		
		for (int i=1; i*i<=n; i++) { // 제곱수는 1로 기록
			memo[i*i] = 1;
		}
		System.out.print(dp(n));
	}
	
	static int dp(int n) {
		if (memo[n] == 0) {
			memo[n] = n;
			for (int i = (int)Math.sqrt(n); i >= 0; i--) {
				memo[n] = Math.min(dp(n - i*i) + 1, memo[n]);
			}
		}
		return memo[n];
	}
}