import java.io.*;
import java.util.*;

public class Bj_11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if (first_abs == second_abs) {
				return o1 > o2 ? 1 : -1; // 절댓값이 같은 경우 음수 우선
			}
			return first_abs - second_abs; // 절댓값 작은 데이터 우선
		});
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pq.isEmpty()) {
					sb.append("0");
				} else {
					sb.append(pq.poll());
				}
				sb.append("\n");
			} else {
				pq.add(x);
			}
		}
		System.out.print(sb.toString());
	}
}