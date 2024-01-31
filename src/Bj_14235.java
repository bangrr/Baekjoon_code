import java.io.*;
import java.util.*;

public class Bj_14235 {
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
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if (a == 0) {
				if (pq.isEmpty()) {
					sb.append(-1);
				} else {
					sb.append(pq.poll()*-1);
				}
				sb.append("\n");
			} else {
				while (a-- > 0) {
					pq.add(Integer.parseInt(st.nextToken())*-1);
				}
			}
		}
	}
}