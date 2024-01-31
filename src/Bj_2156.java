import java.io.*;
import java.util.*;
 
public class Bj_2156 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
        int[][] dp = new int[n+1][3];
        for (int i=1; i<=n; i++) arr[i] = Integer.parseInt(br.readLine());
        int max = dp[1][1] = arr[1];
        if (n>=2) {
            max = dp[2][0] = dp[1][1] + arr[2];
            dp[2][1] = arr[2];
        }
        for (int i=3; i<=n; i++) {
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + arr[i];
            dp[i][1] = Math.max(dp[i-2][0], Math.max(dp[i-2][1], dp[i-2][2])) + arr[i];
            dp[i][2] = Math.max(dp[i-3][0], Math.max(dp[i-3][1], dp[i-3][2])) + arr[i];
            max = Math.max(max, Math.max(dp[i][0], Math.max(dp[i][1], dp[i][2])));
        }
		System.out.print(max);
	}
}