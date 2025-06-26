import java.io.*;
import java.util.*;

public class Bj_5212 {
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
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		char[][] map = new char[r+2][c+2];
		char[][] newmap = new char[r+2][c+2];
		Queue<Pos> q = new LinkedList<>();
		for (int i=1; i<=r; i++) {
			String str = br.readLine();
			for (int j=1; j<=c; j++) {
				char ch = str.charAt(j-1);
				if (ch == 'X') {
					q.add(new Pos(i, j));
				}
				map[i][j] = ch;
				newmap[i][j] = ch;
			}
		}
		
		while (!q.isEmpty()) {
			Pos cur = q.poll();
			int y = cur.r;
			int x = cur.c;
			int cnt = 0;
			if (map[y-1][x] == 'X') cnt++;
			if (map[y][x-1] == 'X') cnt++;
			if (map[y+1][x] == 'X') cnt++;
			if (map[y][x+1] == 'X') cnt++;
			if (cnt < 2) newmap[y][x] = '.';
		}
		
		int miny = r, maxy = 1;
		int minx = c, maxx = 1;
		for (int i=1; i<=r; i++) {
			for (int j=1; j<=c; j++) {
				if (newmap[i][j] == 'X') {
					miny = Math.min(miny, i);
					maxy = Math.max(maxy, i);
					minx = Math.min(minx, j);
					maxx = Math.max(maxx, j);
				}
			}
		}
		
		for (int i=miny; i<=maxy; i++) {
			for (int j=minx; j<=maxx; j++) {
				sb.append(newmap[i][j]);
			}
			sb.append("\n");
		}
	}
}