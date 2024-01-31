import java.io.*;
import java.util.*;

public class Bj_2346 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> nq = new ArrayDeque<>();
		Deque<Integer> dq = new ArrayDeque<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			nq.add(i);
			dq.add(Integer.parseInt(st.nextToken()));
		}
		
		while (!nq.isEmpty()) {
			sb.append(nq.pollFirst()).append(" ");
			int dir = dq.pollFirst();
			
			if (nq.size() == 0) {
				break;
			}
			
			if (dir > 0) {
				while (--dir > 0) {
					nq.addLast(nq.pollFirst());
					dq.addLast(dq.pollFirst());
				}
			} else if (dir < 0) {
				while (dir++ < 0) {
					nq.addFirst(nq.pollLast());
					dq.addFirst(dq.pollLast());
				}
			}
		}
		System.out.print(sb);
	}
}