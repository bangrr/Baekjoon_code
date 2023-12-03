import java.io.*;
import java.util.*;
 
public class Bj_1660 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
 
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
        int MAX = 123;
        int[] arr = new int[MAX+1];
        int[] sum = new int[MAX+1];
        int[] dp = new int[n+1];
        for (int i=1; i<=n; i++) dp[i] = i;
 
        for (int i=1; i<=MAX; i++) {
            arr[i] += (arr[i-1] + i);
            sum[i] += (sum[i-1] + arr[i]);
            //if (sum[i] > 300000) System.out.println(arr[i] +" "+ sum[i] +" "+ i);
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=MAX; j++) {
                if (i < sum[j]) break;
                dp[i] = Math.min(dp[i], dp[i-sum[j]]+1);
            }
        }
        sb.append(dp[n]);
	}
}