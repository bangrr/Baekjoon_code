import java.io.*;
import java.util.*;

public class Bj_11722 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		int ans = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				if (arr[j] > arr[i]) dp[i] = Math.max(dp[j]+1, dp[i]);
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.print(ans);
	}
}