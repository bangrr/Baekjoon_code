import java.io.*;
import java.util.*;

public class Bj_28278 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			if (op == 1) {
				int x = Integer.parseInt(st.nextToken());
				stk.push(x);
			} else if (op == 2) {
				if (!stk.isEmpty()) {
					sb.append(stk.pop()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (op == 3) {
				sb.append(stk.size()).append("\n");
			} else if (op == 4) {
				if (stk.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (op == 5) {
				if (!stk.isEmpty()) {
					sb.append(stk.peek()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}