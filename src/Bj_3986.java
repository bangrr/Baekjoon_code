import java.io.*;
import java.util.*;

public class Bj_3986 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int ans = 0; 
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(ans);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			if (s.length() % 2 == 0) {
				solve(s);
			}
		}
	}
	
	// 문제해결
	static void solve(String s) {
		Stack<Character> stk = new Stack<>();
		for (int i=0; i<s.length(); i++) {
			if (stk.isEmpty()) {
				stk.push(s.charAt(i));
			} else if (stk.peek() == s.charAt(i)) {
				stk.pop();
			} else {
				stk.push(s.charAt(i));
			}
		}
		if (stk.isEmpty()) {
			ans++;
		}
	}
}