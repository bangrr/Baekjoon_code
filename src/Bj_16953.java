import java.io.*;
import java.util.*;

public class Bj_16953 {
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
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		HashMap<Long, Integer> nd = new HashMap<>();
		Queue<Long> q = new LinkedList<>();
		q.add(a);
		nd.put(a, 1);
		
		while(!q.isEmpty()) {
			long cur = q.poll();
			if (cur == b) {
				System.out.println(nd.get(b));
				return;
			}
			
			long next1 = cur*2;
			long next2 = cur*10+1;
			
			if (next1 <= b) { 
				q.add(next1);
				nd.put(next1, nd.get(cur)+1);
			}
			if (cur*10+1 <= b) {
				q.add(next2);
				nd.put(next2, nd.get(cur)+1);
			}
		}
		System.out.println(-1);
	}
}