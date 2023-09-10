import java.io.*;
import java.util.*;

public class Bj_24727 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int N, C, E;
	static int[][] AREA;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		N = Integer.parseInt(br.readLine());
		AREA = new int[N+1][N+1];
		
		st = new StringTokenizer(br.readLine());
		C = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		if (N*N-C-E < 2) {
			sb.append(-1);
			return;
		}
		solve();
	}
	
	// 문제해결
	static void solve() {
		compFill();
		engiFill();
		areaOutput();
	}

	static void compFill() {
		for (int i=0; i<2*N-1; i++) {
			for (int j=0; j<i+1; j++) {
				if (i-j >= N || j >= N) {
					continue;
				}
				if (C == 0) {
					return;
				}
				AREA[i-j][j] = 1;
				AREA[i-j+1][j] = -1;
				AREA[i-j][j+1] = -1;
				C--;
			}
		}
	}
	
	static void engiFill() {
		for (int i=0; i<2*N-1; i++) {
			for (int j=0; j<i+1; j++) {
				int x = N-1-i+j;
				int y = N-1-j;
				if (x < 0 || y < 0) {
					continue;
				}
				if (E == 0 || AREA[x][y] == -1) {
					return;
				}
				AREA[x][y] = 2;
				E--;
			}
		}
	}
	
	static void areaOutput() {
		if (C == 0 && E == 0) {
			sb.append(1).append("\n");
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					if (AREA[i][j] == -1) {
						sb.append(0);
					} else {
						sb.append(AREA[i][j]);
					}
				}
				sb.append("\n");
			}
		} else {
			sb.append(-1);
		}
	}
}