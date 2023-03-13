import java.io.*;

public class Bj_15988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		long[] dp = new long[1000001];
		
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		
		for (int i=4; i<=1000000; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
		}
		
		while (t-- > 0) {
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.print(sb.toString());
	}
}