import java.io.*;
import java.util.*;

public class Bj_15989 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		long[][] dp = new long[10001][4];
		
		dp[1][1] = 1;
		dp[2][1] = 1; dp[2][2] = 1;
		dp[3][1] = 2; dp[3][3] = 1;
		
		for (int i=4; i<=10000; i++) {
			dp[i][1] = dp[i-1][1] + dp[i-1][2] + dp[i-1][3];
			dp[i][2] = dp[i-2][2] + dp[i-2][3];
			dp[i][3] = dp[i-3][3];
		}
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n][1] + dp[n][2] + dp[n][3]).append("\n");
		}
		System.out.print(sb.toString());
	}
}