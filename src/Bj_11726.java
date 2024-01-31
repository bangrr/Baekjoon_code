import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i=2; i<=1000; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		System.out.print(dp[n]);
	}
}