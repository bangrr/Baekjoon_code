import java.io.*;
import java.util.*;

public class Bj_24511 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			if (arr[i] == 0) {
				dq.addLast(Integer.parseInt(st.nextToken()));
			} else {
				st.nextToken();
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			dq.addFirst(Integer.parseInt(st.nextToken()));
			sb.append(dq.pollLast()).append(" ");
		}
		System.out.print(sb);
	}
}