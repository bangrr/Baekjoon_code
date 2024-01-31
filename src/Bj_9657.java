import java.io.*;
 
public class Bj_9657 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[1001];
        dp[1] = dp[3] = dp[4] = true;
		for (int i=5; i<=n; i++) {
            dp[i] = dp[i-1]&&dp[i-3]&&dp[i-4] ? false : true;
        }
        System.out.print(dp[n]?"SK":"CY");
	}
}