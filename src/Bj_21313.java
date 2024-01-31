import java.io.*;
import java.util.*;

public class Bj_21313 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
	}
	
	// 문제해결
	static void solve() {
		for (int i=0; i<n-1; i+=2) {
			sb.append("1 2 ");
		}
		if (n % 2 != 0) {
			sb.append("3");
		}
	}
}