import java.io.*;
import java.util.*;

public class Bj_2161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			queue.offer(i);
		}
		for (int i=1; i<=n; i++) {
			sb.append(queue.poll()).append(" ");
			queue.offer(queue.poll());
		}
		System.out.print(sb);
	}
}