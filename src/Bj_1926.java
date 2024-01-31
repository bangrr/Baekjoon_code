import java.io.*;
import java.util.*;

public class Bj_1926 {
	static class Pos {
		int r, c;
		
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, m, area, cnt = 0, ans = 0;
	static Queue<Pos> q = new LinkedList<>();
	static int[][] picture;
	static int[] DR = {1, 0, -1, 0};
	static int[] DC = {0, 1, 0, -1};
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		BFS();
		System.out.println(cnt);
		System.out.println(ans);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		picture = new int[n+1][m+1];
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=m; j++) {
				picture[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
	
	static void BFS() {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				if (picture[i][j] == 1) {
					area = 0;
					q.add(new Pos(i, j));
					picture[i][j] = 0;
					while(!q.isEmpty()) {
						Pos cur = q.poll(); // 큐에서 하나를 뽑아냄
						area++;
						for (int d=0; d<4; d++) {
							int nextR = cur.r + DR[d];
							int nextC = cur.c + DC[d];
							
							// 다음 탐색할 위치가 범위를 벗어나거나 이미 방문한 곳이면 탐색에서 제외
							if (nextR <= 0 || nextR > n || nextC <= 0 || nextC > m || 
									picture[nextR][nextC] == 0 ) {
								continue;
							}
							
							q.add(new Pos(nextR, nextC));
							picture[nextR][nextC] = 0;
						}
					}
					cnt++;
				}
				ans = Math.max(ans, area);
			}
		}
	}
}