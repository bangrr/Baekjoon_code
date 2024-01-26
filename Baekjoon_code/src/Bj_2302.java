import java.io.*;
import java.util.*;
 
public class Bj_2302 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] dp = new int[41];
        dp[0] = dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        int[] vip = new int[m+2];
        vip[0] = 0; vip[m+1] = n+1;
        for (int i=1; i<=m; i++) {
            vip[i] = Integer.parseInt(br.readLine());
        }
        int ans = 1;
        for (int i=1; i<m+2; i++) {
            ans *= dp[vip[i]-vip[i-1]-1];
        }
        System.out.print(ans);
	}
}