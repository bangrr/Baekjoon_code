import java.io.*;
import java.util.*;

public class Bj_5397 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int m = Integer.parseInt(br.readLine());
		
		while (m-- > 0) {
			Stack<Character> leftStk = new Stack<>();
			Stack<Character> rightStk = new Stack<>();
			
			String s = br.readLine();
			for (int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if (c == '<') {
					if (!leftStk.isEmpty()) {
						rightStk.push(leftStk.pop());
					}
				} else if (c == '>') {
					if (!rightStk.isEmpty()) {
						leftStk.push(rightStk.pop());
					}
				} else if (c == '-') {
					if (!leftStk.isEmpty()) {
						leftStk.pop();
					}
				} else {
					leftStk.push(c);
				}
			}
			while (!leftStk.isEmpty()) {
				rightStk.push(leftStk.pop());
			}
			while (!rightStk.isEmpty()) {
				sb.append(rightStk.pop());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}