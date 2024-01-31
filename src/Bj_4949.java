import java.io.*;
import java.util.*;

public class Bj_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			Stack<Character> stk = new Stack<>();
			String s = br.readLine();
			if (s.length() == 1 && s.charAt(0)=='.') {
				break;
			}
			for (int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '[') {
					stk.push(c);
				} else if (c == ')' && !stk.empty() && stk.peek() == '(') {
					stk.pop();
				} else if (c == ']' && !stk.empty() && stk.peek() == '[') {
					stk.pop();
				} else if (c == ')' || c == ']') {
					stk.push(c);
				}
			}
			if (stk.empty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		System.out.print(sb);
	}
}