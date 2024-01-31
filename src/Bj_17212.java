import java.io.*;
import java.util.*;

public class Bj_17212 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[100001];
		for (int i=0; i<=n; i++) {
			if (i>=1) dp[i] = dp[i-1]+1;
			if (i>=2) dp[i] = Math.min(dp[i], dp[i-2]+1);
			if (i>=5) dp[i] = Math.min(dp[i], dp[i-5]+1);
			if (i>=7) dp[i] = Math.min(dp[i], dp[i-7]+1);
		}
		System.out.print(dp[n]);
	}
}