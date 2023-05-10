import java.io.*;
import java.util.*;

public class Bj_1927 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	// 변수선언부
	static PriorityQueue<Integer> pq = new PriorityQueue<>();

	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}

	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			solve(x);
		}
	}

	// 출력부
	static void solve(int x) {
		if (x == 0) {
			if (pq.isEmpty()) {
				sb.append(0);
			} else {
				sb.append(pq.poll());
			}
			sb.append("\n");
		} else {
			pq.offer(x);
		}
	}
}