import java.io.*;
import java.util.*;
 
public class Bj_2688 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
		long[][] dp = new long[65][10];
        Arrays.fill(dp[1], 1);
        long[] sum = new long[65];
 
        for (int i=1; i<65; i++) {
            for (int j=0; j<10; j++) {
                for (int k=j; k<10; k++) {
                	dp[i][j] += dp[i-1][k];
                }
                sum[i] += dp[i][j];
            }
        }
        while (t-- > 0) {
            sb.append(sum[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.print(sb);
	}
}