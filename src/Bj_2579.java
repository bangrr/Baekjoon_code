import java.io.*;
import java.util.*;
 
public class Bj_2579 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
        int[][] dp = new int[n+1][2];
        for (int i=1; i<=n; i++) arr[i] = Integer.parseInt(br.readLine());
        dp[1][1] = arr[1];
        for (int i=2; i<=n; i++) {
            dp[i][0] = dp[i-1][1] + arr[i];
            dp[i][1] = Math.max(dp[i-2][0], dp[i-2][1]) + arr[i];
        }
		System.out.print(Math.max(dp[n][0], dp[n][1]));
	}
}