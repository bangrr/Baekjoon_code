import java.io.*;
import java.util.*;

public class Bj_11899 {
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
		String s = br.readLine();
		Stack<Character> stk = new Stack<>();
		int cnt = 0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stk.push(c);
			} else if (c == ')') {
				if (stk.isEmpty()) {
					cnt++;
				} else {
					stk.pop();
				}
			}
		}
		cnt+=stk.size();
		System.out.println(cnt);
	}
}