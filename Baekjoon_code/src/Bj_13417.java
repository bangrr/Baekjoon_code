import java.io.*;
import java.util.*;

public class Bj_13417 {
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
			Deque<Character> dq = new ArrayDeque<>();
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				char c = st.nextToken().charAt(0);
				if (dq.isEmpty()) {
					dq.addLast(c);
				} else {
					if (dq.peekFirst() < c) {
						dq.addLast(c);
					} else {
						dq.addFirst(c);
					}
				}
			}
			for (char ch : dq) sb.append(ch);
			sb.append("\n");
		}
	}
}