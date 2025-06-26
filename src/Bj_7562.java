import java.io.*;
import java.util.*;

public class Bj_7562 {
	private static class Pos {
		int r, c, cnt;
		
		public Pos(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}
	
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int[] DR = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] DC = {2, 1, -1, -2, -2, -1, 1, 2};
	static boolean[][] visited;
	static int L, S_R, S_C, E_R, E_C;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			L = Integer.parseInt(br.readLine());
			visited = new boolean[L][L];
			
			st = new StringTokenizer(br.readLine());
			S_R = Integer.parseInt(st.nextToken());
			S_C = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			E_R = Integer.parseInt(st.nextToken());
			E_C = Integer.parseInt(st.nextToken());
			
			if (S_R == E_R && S_C == E_C) {
				System.out.println(0);
				continue;
			}
			bfs();
		}
	}
	
	// 문제해결
	static void bfs() {
		Queue<Pos> q = new LinkedList<>(); // bfs를 위한 큐
		q.add(new Pos(S_R, S_C, 0));
		while (!q.isEmpty()) {
			Pos cur = q.poll(); // 큐에서 하나를 꺼냄
			for (int i=0; i<DR.length; i++) { // 이동가능한 칸 탐색진행
				int nextR = cur.r + DR[i];
				int nextC = cur.c + DC[i];
				int nextCnt = cur.cnt + 1;
				
				// 다음 이동할 위치가 체스판을 벗어나거나 이미 방문한 칸이면 탐색에서 제외
				if (nextR < 0 || nextR >= L || nextC < 0 || nextC >= L
						|| visited[nextR][nextC]) {
					continue;
				}
				
				if (nextR == E_R && nextC == E_C) {
					System.out.println(nextCnt);
					return;
				}
				
				q.add(new Pos(nextR, nextC, nextCnt)); // 큐에 다음 탐색할 위치를 넣음
				visited[nextR][nextC] = true; // 큐에 넣은 곳은 방문체크
			}
		}
	}
}