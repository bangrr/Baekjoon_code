import java.io.*;
import java.util.*;
 
public class Bj_1149 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][3];
        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + Integer.parseInt(st.nextToken());
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + Integer.parseInt(st.nextToken());
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + Integer.parseInt(st.nextToken());
        }
		System.out.print(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
	}
}