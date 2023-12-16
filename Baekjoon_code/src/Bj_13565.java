import java.io.*;
import java.util.*;

public class Bj_13565 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int m, n;
	static int[] dy = {1, 0, -1, 0};
	static int[] dx = {0, 1, 0, -1};
	static boolean[][] grid;
	static Queue<int[]> q;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		grid = new boolean[m][n];
		String s;
		for (int i=0; i<m; i++) {
			s = br.readLine();
			for (int j=0; j<n; j++) {
				grid[i][j] = s.charAt(j) == '0' ? false : true;
			}
		}
		
		for (int j=0; j<n; j++) {
			if (!grid[0][j]) {
				q = new LinkedList<>();
				q.add(new int[]{0, j});
				grid[0][j] = true;
				if (bfs()) {
					System.out.print("YES");
					return;
				}
			}
		}
		System.out.print("NO");
	}
	
	// 문제해결
	static boolean bfs() {
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cy = cur[0];
			int cx = cur[1];
			if (cy == m-1) {
				return true;
			}
			for (int i=0; i<4; i++) {
				int ny = cy+dy[i];
				int nx = cx+dx[i];
				if (ny < 0 || nx < 0 || ny >= m || nx >= n || grid[ny][nx]) continue;
				q.add(new int[] {ny, nx});
				grid[ny][nx] = true;
			}
		}
		return false;
	}
}