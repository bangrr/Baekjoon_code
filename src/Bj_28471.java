import java.io.*;
import java.util.*;

public class Bj_28471 {
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
	static int n, ans;
	static char[][] map;
	static Queue<Pos> q;
	static int[] dr = {1, 0, -1, -1, -1, 0, 1};
	static int[] dc = {1, 1, 1, 0, -1, -1, -1};
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		// w키가 빠졌는데 F목적지를 가야하면 역으로
		// F목적지에서 s키를 빼고 다른 점들을 갈 수 있는지 체크
		input();
		bfs();
		System.out.print(ans);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		q = new ArrayDeque<>();
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			for (int j=0; j<n; j++) {
				map[i][j] = s.charAt(j);
				if (map[i][j] == 'F') q.add(new Pos(i, j));
			}
		}
	}
	
	static void bfs() {
		while (!q.isEmpty()) {
			Pos cur = q.poll();
			for (int i=0; i<dr.length; i++) {
				int nextR = cur.r + dr[i];
				int nextC = cur.c + dc[i];
				if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || map[nextR][nextC] != '.') {
					continue;
				}
				map[nextR][nextC] = '#';
				q.add(new Pos(nextR, nextC));
				ans++;
			}
		}
	}
}