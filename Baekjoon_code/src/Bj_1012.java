import java.io.*;
import java.util.*;

public class Bj_1012 {
	static class Pos {
		int r, c, dist;
		
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			boolean[][] board = new boolean[n][m];
			while (k-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				board[y][x] = true;
			}
			
			Queue<Pos> q = new LinkedList<>();	// BFS를 위한 큐
			int ans = 0;
			for(int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					// 출발지 정보 입력 ( true 이면서 방문하지 않았어야 한다. )
					if (board[i][j]) {
						q.add(new Pos(i, j));
						ans++;
					
					
						while (!q.isEmpty()) {
							Pos cur = q.poll();	// 큐에서 하나 꺼냄
							board[i][j] = false;
							for (int rc=0; rc<4; rc++) {
								int[] r = {1, 0, -1, 0};
								int[] c = {0, 1, 0, -1};
								int nextR = cur.r + r[rc];
								int nextC = cur.c + c[rc];
								
								// 다음 탐색할 위치가 미로를 벗어났거나 이미 방문한 곳은 제외
								if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= m || 
										!board[nextR][nextC]) {
									continue;
								}
								
								q.add(new Pos(nextR, nextC));	// 다음 탐색할 곳을 넣음
								board[nextR][nextC] = false;
							}
						}
					}
				}
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
}