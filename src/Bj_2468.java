import java.io.*;
import java.util.*;
/*

n*n 높이정보가 주어짐

임의의 높이 h 이하가 잠기게 되면 잠기지않는 안전지대(>h) 의 최대갯수

Pos(int r, int c) : 배열의 좌표를 나타내는 객체
n : 배열의 행,열 갯수 (2~100)
h : 임의의 높이 (1~100)
safeCnt : h 높이일때 안전영역 갯수 (변하는 h마다 지역변수로)
maxSafeCnt : 안전영역 최대 갯수

*/
public class Bj_2468 {
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
	static int n, h=0, maxSafeCnt = 0;
	static Queue<Pos> q = new LinkedList<>();
	static int[][] area;
	static int[] DR = {1, 0, -1, 0};
	static int[] DC = {0, 1, 0, -1};
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		for (; h<=100; h++) {
			BFS();
		}
		System.out.println(maxSafeCnt);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		
		area = new int[n][n];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
	}
	
	static void BFS() {
		int safeCnt = 0;
		boolean visited[][] = new boolean[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (!visited[i][j] && area[i][j] > h) {
					q.add(new Pos(i, j));
					visited[i][j] = true;
					while(!q.isEmpty()) {
						Pos cur = q.poll(); // 큐에서 하나를 뽑아냄
						for (int d=0; d<4; d++) {
							int nextR = cur.r + DR[d];
							int nextC = cur.c + DC[d];
							
							// 다음 탐색할 위치가 범위를 벗어나거나 이미 방문한 곳이면 탐색에서 제외
							if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || 
									visited[nextR][nextC] || area[nextR][nextC] <= h) {
								continue;
							}
							q.add(new Pos(nextR, nextC));
							visited[nextR][nextC] = true;
						}
					}
					safeCnt++;
				}
			}
		}
		maxSafeCnt = Math.max(maxSafeCnt, safeCnt);
	}
}