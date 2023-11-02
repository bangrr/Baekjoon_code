import java.io.*;
import java.util.*;
 
public class Bj_1912 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i=1; i<=n; i++) {
            dp[i] = arr[i] + Math.max(dp[i-1], 0);
            max = Math.max(dp[i], max);
        }
		System.out.print(max);
	}
}