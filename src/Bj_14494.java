import java.io.*;
import java.util.*;

public class Bj_14494 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] dp = new int[n+1][m+1];
		int mod = 1000000007;
		dp[0][0] = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				dp[i][j] = ((dp[i-1][j-1] + dp[i-1][j])%mod + dp[i][j-1])%mod;
			}
		}
		System.out.print(dp[n][m]);
	}
}