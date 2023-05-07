import java.io.*;
import java.util.*;

public class Bj_1021 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, m, ans;
	static Deque<Integer> deque;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.println(ans);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		deque = new LinkedList<>();
		for (int i=1; i<=n; i++) {
			deque.add(i);
		}
		
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			ans += solve(Integer.parseInt(st.nextToken()));
		}
	}
	
	// 출력부
	static int solve(int a) {
		int min = 0;
		if (deque.peek() == a) {
			deque.poll();
		} else if (deque.peek() != a) {
			int c = 0;
			while (deque.peek() != a) {
				// left shift pollFirst addLast
				deque.addLast(deque.pollFirst());
				c++;
			}
			min = c;
			
			// right shift c times
			while (c-- > 0) {
				deque.addFirst(deque.pollLast());
			}
			
			c = 0;
			while (deque.peek() != a) {
				// right shift pollLast addFirst
				deque.addFirst(deque.pollLast());
				c++;
			}
			deque.poll();
			min = Math.min(min, c);
		}
		return min;
	}
}