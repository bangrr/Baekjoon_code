import java.io.*;
import java.util.*;

public class Bj_4963 {
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
	static int w, h;
	static int[] dr = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[][] map;
	static Queue<Pos> q;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0) { break; }
			
			map = new int[h+1][w+1];
			for (int i=1; i<=h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j=1; j<=w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			q = new LinkedList<>();
			bfs();
		}
	}
	
	// 문제해결
	static void bfs() {
		int cnt = 0;
		for (int i=1; i<=h; i++) {
			for (int j=1; j<=w; j++) {
				if (map[i][j] == 1) {
					cnt++;
					q.add(new Pos(i, j));
					map[i][j] = 0;
					while (!q.isEmpty()) {
						Pos cur = q.poll(); // 큐에서 하나를 빼냄
						
						for (int d=0; d<8; d++) {
							int nextR = cur.r + dr[d];
							int nextC = cur.c + dc[d];
							
							// 범위체크
							if (nextR <= 0 || nextR > h || nextC <= 0 || nextC > w || 
									map[nextR][nextC] == 0 ) {
								continue;
							}
							
							q.add(new Pos(nextR, nextC));
							map[nextR][nextC] = 0;
						}
					}
				}
			}
		}
		sb.append(cnt).append("\n");
	}
}