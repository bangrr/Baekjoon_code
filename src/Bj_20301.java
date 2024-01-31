import java.io.*;
import java.util.*;

public class Bj_20301 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int c = 0;
		boolean cw = true;
		
		for (int i=1; i<=n; i++) {
			dq.add(i);
		}
		
		while (!dq.isEmpty()) {
			if (cw) {
				for (int i=0; i<k-1; i++) {
					dq.addLast(dq.pollFirst());
				}
				sb.append(dq.pollFirst());
			} else {
				for (int i=0; i<k-1; i++) {
					dq.addFirst(dq.pollLast());
				}
				sb.append(dq.pollLast());
			}
			sb.append("\n");
			c++;
			if (c == m) {
				cw = !cw;
				c = 0;
			}
		}
		
		System.out.print(sb);
	}
}