import java.io.*;
import java.util.*;

public class Bj_29791 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> nq = new PriorityQueue<>();
		PriorityQueue<Integer> mq = new PriorityQueue<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			nq.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			mq.add(Integer.parseInt(st.nextToken()));
		}
		
		int nc = 1;
		int ns = nq.poll();
		while (!nq.isEmpty()) {
			int t = nq.poll();
			if (t - ns >= 100) {
				nc++;
				ns = t;
			}
		}
		
		int mc = 1;
		int ms = mq.poll();
		while (!mq.isEmpty()) {
			int t = mq.poll();
			if (t - ms >= 360) {
				mc++;
				ms = t;
			}
		}
		
		System.out.println(nc + " " + mc);
	}
}