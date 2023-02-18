import java.io.*;

public class Bj_1003 {
//	static int zero, one;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int dp[][] = new int[41][2];
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for (int i=2; i<41; i++) {
			dp[i][0] = dp[i-2][0] + dp[i-1][0];
			dp[i][1] = dp[i-2][1] + dp[i-1][1];
		}
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
//			zero = 0;
//			one = 0;
//			fibonacci(n); // 그냥 함수 호출로 돌리니까 시간 초과 발생
			sb.append(dp[n][0]+ " " + dp[n][1]).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}