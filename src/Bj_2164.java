import java.util.*;

public class Bj_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i=1; i<=n; i++) {
			q.offer(i);
		}
		sc.close();
		
		while (q.size() != 1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.peek());
	}
}