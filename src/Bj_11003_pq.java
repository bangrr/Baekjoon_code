import java.io.*;
import java.util.*;

public class Bj_11003_pq {
	static class Item {
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
	static PriorityQueue<Item> pq;
	
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
		pq = new PriorityQueue<Item>((o1, o2) -> {
			return o1.value==o2.value ? o1.idx-o2.idx : o1.value-o2.value;
		});
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			pq.add(new Item(i, a));
			while (pq.peek().idx <= i-L) { // pq에 남은 최솟값이 L범위 안에 들어올 때까지 삭제
//				System.out.println(i + " size " + pq.size() + " idx " + pq.peek().idx);
//				System.out.println(pq.peek().value);
				pq.poll();
			}
			sb.append(pq.peek().value).append(" ");
		}
	}
}