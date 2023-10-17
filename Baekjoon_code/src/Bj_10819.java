import java.io.*;
import java.util.*;

public class Bj_10819 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		Deque<Integer> deq = new ArrayDeque<>();
		for (int i=0; i<n/2; i++) {
			if (i % 2 == 0) {
				deq.addFirst(arr[i]);
				deq.addLast(arr[n-1-i]);
			} else {
				deq.addLast(arr[i]);
				deq.addFirst(arr[n-1-i]);
			}
		}
		if (n % 2 == 1) {
			if (Math.abs(deq.peekFirst()-arr[n/2]) > Math.abs(deq.peekLast()-arr[n/2])) {
				deq.addFirst(arr[n/2]);
			} else {
				deq.addLast(arr[n/2]);
			}
		}
		int sum = 0;
		int prev = deq.poll();
		while (!deq.isEmpty()) {
			int cur = deq.poll();
			sum += Math.abs(cur - prev);
			prev = cur;
		}
		System.out.print(sum);
	}
}