import java.io.*;
import java.util.*;

public class Bj_1697 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static ArrayList<Integer>[] edge;
	static int MAX;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		MAX = 2*k;
		if (n >= k) { // n 이 k 보다 크거나 같을 때는 빼는 방법밖에 없다
			System.out.println(n-k);
			return;
		}
		
		edge = new ArrayList[MAX];
		for (int i=0; i<MAX; i++) { // 이동할 수 있는 곳 저장하기
			edge[i] = new ArrayList<>();
			edge[i].add(i-1);
			edge[i].add(i+1);
			edge[i].add(2*i);
		}
		
		bfs(n, k, edge);
	}
	
	// 문제해결
	static void bfs(int n, int k, ArrayList<Integer>[] edge) {
		Queue<Integer> q = new LinkedList<>(); // BSF를 위한 큐
		boolean[] visited = new boolean[MAX];
		int[] time = new int[MAX]; // 걸린시간
		Arrays.fill(time, -1);
		
		q.add(n);
		visited[n] = true;
		time[n] = 0;
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : edge[cur]) {
				if (next < 0 || next >= MAX || visited[next]) {
					continue; // 이미 방문했다면 무시
				}
				
				q.add(next); // 다음 위치를 큐에 넣음
				visited[next] = true; // 다음 위치 방문체크
				time[next] = time[cur] + 1; // 다음 위치까지 최소 시간
				
				if (next == k) {
					System.out.print(time[k]);
					return; // 목적지에 도달했으면 빠져나감.
				}
			}
		}
	}
}