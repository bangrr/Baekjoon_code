import java.io.*;
import java.util.*;

public class Bj_9613 {
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
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			
			for (int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long sum = 0;
			for (int i=0; i<n-1; i++) {
				for (int j=i+1; j<n; j++) {
					sum += gcd(arr[i], arr[j]);
				}
			}
			sb.append(sum).append("\n");
		}
	}
	
	// gcd
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}