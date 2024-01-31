import java.io.*;
import java.util.*;
 
public class Bj_11057 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][10];
        Arrays.fill(dp[1], 1);
        int sum = 0;
 
        for (int i=2; i<=n; i++) {
            for (int j=0; j<10; j++) {
                for (int k=j; k<10; k++) {
                	dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
                }
            }
        }
        for (int it : dp[n]) sum += it;
        System.out.print(sum % 10007);
	}
}