import java.io.*;
import java.util.*;

public class Bj_1063 {
	static class Something {
		int r, c;
		
		public Something(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static Something curKing, curStone;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		String king = st.nextToken();
		curKing = new Something(8-king.charAt(1)+'0', king.charAt(0)-'A');
		String stone = st.nextToken();
		curStone = new Something(8-stone.charAt(1)+'0', stone.charAt(0)-'A');
		int n = Integer.parseInt(st.nextToken());
		while (n-- > 0) {
			String dir = br.readLine();
			move(dir);
		}
		sb.append((char)(curKing.c+'A')).append(8-curKing.r).append("\n");
		sb.append((char)(curStone.c+65)).append(8-curStone.r);
	}
	
	static boolean check(int r, int c) {
		return r >= 0 && r < 8 && c >= 0 && c < 8;
	}
	
	static void move(String dir) {
		int nr = 0, nc = 0;
		if (dir.equals("R")) {
			nc = 1;
		} else if (dir.equals("L")) {
			nc = -1;
		} else if (dir.equals("B")) {
			nr = 1;
		} else if (dir.equals("T")) {
			nr = -1;
		} else if (dir.equals("RT")) {
			nc = 1; nr = -1;
		} else if (dir.equals("LT")) {
			nc = -1; nr = -1;
		} else if (dir.equals("RB")) {
			nc = 1; nr = 1;
		} else if (dir.equals("LB")) {
			nc = -1; nr = 1;
		}
		int nkr = curKing.r + nr;
		int nkc = curKing.c + nc;
		if (check(nkr, nkc)) {
			if (nkr == curStone.r && nkc == curStone.c) {
				int nsr = curStone.r + nr;
				int nsc = curStone.c + nc;
				if (check(nsr, nsc)) {
					curStone.r = nsr;
					curStone.c = nsc;
					curKing.r = nkr;
					curKing.c = nkc;
				}
			} else {
				curKing.r = nkr;
				curKing.c = nkc;				
			}
		}
	}
}