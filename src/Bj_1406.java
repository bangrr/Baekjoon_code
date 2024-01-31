import java.io.*;
import java.util.*;

public class Bj_1406 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		Stack<Character> leftStk = new Stack<>();
		Stack<Character> rightStk = new Stack<>();
		
		String s = br.readLine();
		int idx = s.length();
		for (int i=0; i<idx; i++) {
			leftStk.push(s.charAt(i));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while (m-- > 0) {
			String o = br.readLine();
			char c = o.charAt(0);
			if (c == 'L') {
				if (!leftStk.isEmpty()) {
					rightStk.push(leftStk.pop());
				}
			} else if (c == 'D') {
				if (!rightStk.isEmpty()) {
					leftStk.push(rightStk.pop());
				}
			} else if (c == 'B') {
				if (!leftStk.isEmpty()) {
					leftStk.pop();
				}
			} else if (c == 'P') {
				char x = o.charAt(2);
				leftStk.push(x);
			}
		}
		while (!leftStk.isEmpty()) {
			rightStk.push(leftStk.pop());
		}
		while (!rightStk.isEmpty()) {
			sb.append(rightStk.pop());
		}
		System.out.print(sb);
	}
}