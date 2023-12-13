import java.io.*;
import java.util.*;

public class Bj_9753_countDivisor {
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
			int n = Integer.parseInt(br.readLine());
			while (solve(n) != 4) n++;
			sb.append(n).append("\n");
		}
	}
	
	// 문제해결
	static int solve(int n) {
		int ret = 0;
		for (int i=1; i<=n; i++) if (n % i == 0) ret++;
		return ret;
	}
}