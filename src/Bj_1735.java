import java.io.*;
import java.util.*;

public class Bj_1735 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int a, b, c, d, g;
	static int top, bottom;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine()); // a/b
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()); // c/d
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
	}
	
	// 출력부
	static void solve() {
		top = a*d + b*c;
		bottom = b*d;
		g = gcd(top, bottom);
		sb.append(top/g).append(" ").append(bottom/g);
	}
	
	static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		return gcd(q, p%q);
	}
}