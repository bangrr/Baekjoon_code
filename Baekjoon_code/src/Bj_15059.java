import java.io.*;
import java.util.*;

public class Bj_15059 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int[] a, b;
	static int sum = 0;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
	}
	
	// 입력부
	static void input() throws IOException {
		a = new int[3];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		b = new int[3];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<3; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	// 문제해결
	static void solve() {
		for (int i=0; i<3; i++) {
			if (b[i] - a[i] > 0) {
				sum += Math.abs(b[i] - a[i]);
			}
		}
		System.out.print(sum);
	}
}