import java.io.*;
import java.util.*;

public class Bj_2583 {
	private static class Pos {
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
	static int m, n, k, cnt;
	static boolean[][] square;
	static int[] DR = {1, 0, -1, 0};
	static int[] DC = {0, 1, 0, -1};
	static Queue<Pos> q = new LinkedList<>();
	static ArrayList<Integer> list = new ArrayList<>();
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (!square[i][j]) {
					bfs(i, j);
				}
			}
		}
		sb.append(cnt).append("\n");
		Collections.sort(list);
		for (int i=0; i<list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		square = new boolean[m][n];
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			paint(x1, y1, x2, y2);
		}
	}
	
	// 직사각형 그리기
	static void paint(int x1, int y1, int x2, int y2) {
		for (int i=y1; i<y2; i++) {
			for (int j=x1; j<x2; j++) {
				square[i][j] = true;
			}
		}
	}
	
	// 문제해결
	static void bfs(int i, int j) {
		q.add(new Pos(i, j));
		square[i][j] = true;
		int area = 1;
		cnt++;
		
		while (!q.isEmpty()) {
			Pos cur = q.poll();
			for (int d=0; d<DR.length; d++) {
				int nextR = cur.r + DR[d];
				int nextC = cur.c + DC[d];
				
				if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || 
						square[nextR][nextC]) {
					continue;
				}
				
				q.add(new Pos(nextR, nextC));
				square[nextR][nextC] = true;
				area++;
			}
		}
		list.add(area);
	}
}