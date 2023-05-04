import java.io.*;
import java.util.*;

public class Bj_9507 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int t, n;
	static long[] koong;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			solve();
		}
	}
	
	// 출력부
	static void solve() {
		koong = new long[68];
		koong[0] = koong[1] = 1;
		koong[2] = 2;
		koong[3] = 4;
		for (int i=4; i<=67; i++) {
			koong[i] = koong[i-1] + koong[i-2] + koong[i-3] + koong[i-4];
		}
		sb.append(koong[n]).append("\n");
	}
}