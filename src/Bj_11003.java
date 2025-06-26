import java.io.*;
import java.util.*;

public class Bj_11003 {
	private static class Item {
		int idx, value;
		
		public Item(int idx, int value) {
			this.idx = idx;
			this.value = value;
		}
	}
	
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int N, L;
	static Deque<Item> dq;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		dq = new ArrayDeque<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			while (!dq.isEmpty() && dq.getLast().value >= a) dq.removeLast();
			dq.addLast(new Item(i, a));
			while (!dq.isEmpty() && dq.getFirst().idx <= i-L) dq.removeFirst();
			sb.append(dq.peek().value).append(" ");
		}
	}
}