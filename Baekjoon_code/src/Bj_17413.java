import java.io.*;
import java.util.*;

public class Bj_17413 {
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
		boolean isTag = false;
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c == '<') {
				isTag = true;
				while (!stk.isEmpty()) {
					sb.append(stk.pop());
				}
				sb.append(c);
			} else if (c == '>') {
				isTag = false;
				sb.append(c);
			} else if (c == ' ') {
				while (!stk.isEmpty()) {
					sb.append(stk.pop());
				}
				sb.append(c);
			} else {
				if (isTag) {
					sb.append(c);
				} else {
					stk.add(c);
				}
			}
		}
		while (!stk.isEmpty()) {
			sb.append(stk.pop());
		}
	}
}