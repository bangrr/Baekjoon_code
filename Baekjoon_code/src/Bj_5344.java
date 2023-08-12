import java.io.*;
import java.util.*;

public class Bj_5344 {
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
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(gcd(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
	}
	
	// 문제해결
	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
}