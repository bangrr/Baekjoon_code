import java.io.*;

public class Bj_9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		
		for (int i=4; i<=11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		while (t-- > 0) {
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.print(sb.toString());
	}
}