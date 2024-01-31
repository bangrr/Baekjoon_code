import java.io.*;
import java.util.*;
 
public class Bj_1904 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int mod = 15746;
        int[] dp = new int[n+5];
        dp[0] = dp[1] = 1; dp[2] = 2;
        for (int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % mod;
        }
        System.out.print(dp[n]);
	}
}