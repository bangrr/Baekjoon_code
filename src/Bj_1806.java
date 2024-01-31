import java.io.*;
import java.util.*;

public class Bj_1806 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, s;
	static int[] arr, sum;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		sum = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			sum[i] = sum[i-1] + (arr[i] = Integer.parseInt(st.nextToken()));
		}
		
		int lp = 1, rp = 1, min = Integer.MAX_VALUE;
		while (lp <= n && rp <= n) {
			int tmp = sum[rp] - sum[lp-1];
			if (tmp >= s) {
				min = Math.min(min, rp-lp+1);
			}
			if (tmp < s) {
				rp++;
			} else {
				lp++;
			}
		}
		System.out.print(min == Integer.MAX_VALUE ? 0 : min);
	}
}