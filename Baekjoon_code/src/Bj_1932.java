import java.io.*;
import java.util.*;

public class Bj_1932 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static int[][] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve(n-2);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
	
	// 문제해결
	static void solve(int p) {
		for (int i=p; i>=0; i--) {
			for (int j=p; j>=0; j--) {
				arr[i][j] += Math.max(arr[i+1][j], arr[i+1][j+1]);
			}
		}
		System.out.print(arr[0][0]);
	}
}