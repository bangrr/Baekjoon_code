import java.io.*;
import java.util.*;

public class Bj_30036 {
	static class Square {
		int y, x, ink;
		
		public Square(int y, int x, int ink) {
			this.y = y;
			this.x = x;
			this.ink = ink;
		}
	}
	
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static Square sq;
	static int I, N, K, idx;
	static String inkStr;
	static char[][] stage;
	static String cmdStr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		I = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		idx = 0;
		inkStr = br.readLine(); // 길이가 I인 문자열
		stage = new char[N][N]; // 사각형은 @ 빈칸은 . 장애물 # 염색되면 알파벳
		for (int i=0; i<N; i++) {
			String row = br.readLine();
			for (int j=0; j<N; j++) {
				stage[i][j] = row.charAt(j);
				if (row.charAt(j) == '@') {
					sq = new Square(i, j, 0);
				}
			}
		}
		cmdStr = br.readLine(); // 길이가 K인 문자열

		for (int i=0; i<K; i++) {
			char cmd = cmdStr.charAt(i);
			if (cmd == 'j') {
				sq.ink++;
			} else if (cmd == 'J') {
				paint();
			} else {
				move(cmd);
			}
		}
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				sb.append(stage[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static void paint() {
		for (int i=sq.y-sq.ink; i<=sq.y+sq.ink; i++) {
			for (int j=sq.x-sq.ink; j<=sq.x+sq.ink; j++) {
				if (i >= 0 && i < N && j >= 0 && j < N && 
						Math.abs(sq.y - i) + Math.abs(sq.x - j) <= sq.ink && 
						stage[i][j] != '.' && stage[i][j] != '@') {
					stage[i][j] = inkStr.charAt(idx);
				}
			}
		}
		sq.ink = 0;
		idx++;
		if (idx == I) { idx = 0; }
	}

	static void move(char cmd) {
		if (cmd == 'U') {
			if (sq.y-1 >= 0 && stage[sq.y-1][sq.x] == '.') {
				stage[sq.y-1][sq.x] = '@';
				stage[sq.y][sq.x] = '.';
				sq.y--;
			}
		} else if (cmd == 'R') {
			if (sq.x+1 < N && stage[sq.y][sq.x+1] == '.') {
				stage[sq.y][sq.x+1] = '@';
				stage[sq.y][sq.x] = '.';
				sq.x++;
			}
		} else if (cmd == 'D') {
			if (sq.y+1 < N && stage[sq.y+1][sq.x] == '.') {
				stage[sq.y+1][sq.x] = '@';
				stage[sq.y][sq.x] = '.';
				sq.y++;
			}
		} else if (cmd == 'L') {
			if (sq.x-1 >= 0 && stage[sq.y][sq.x-1] == '.') {
				stage[sq.y][sq.x-1] = '@';
				stage[sq.y][sq.x] = '.';
				sq.x--;
			}
		}
	}
}