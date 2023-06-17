import java.io.*;
import java.util.*;

public class Bj_14281 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, chk;
	static long cnt = 0;
	static int[] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	// 문제해결
	static void solve() {
		chk = n;
		while (chk > 0) {
			chk = 0;
			for (int i=1; i<n-1; i++) {
				if (arr[i-1] + arr[i+1] < 2 * arr[i]) {
					int t = (arr[i-1] + arr[i+1]) / 2;
					cnt += arr[i] - t;
					arr[i] = t;
					chk++;
				}
			}
		}
		sb.append(cnt);
	}
}