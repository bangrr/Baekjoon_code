import java.io.*;
import java.util.*;

public class Bj_17393 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int N;
	static long[] A, B;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		N = Integer.parseInt(br.readLine());
		A = new long[N];
		B = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			B[i] = Long.parseLong(st.nextToken());
		}
	}
	
	// 문제해결
	static void solve() {
		for (int i=0; i<N; i++) {
			sb.append(binarySearch(i, N-1, A[i])).append(" ");
		}
	}
	
	// 이분탐색
	static int binarySearch(int i, int j, long a) {
		int l = i;
		int r = j;
		int res = i;
		while (l <= r) {
			int mid = (l + r) / 2;
			
			if (a >= B[mid]) {
				res = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return res-i;
	}
}