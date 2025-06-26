import java.io.*;
import java.util.*;

public class Bj_2178 {
	private static class Pos {
		int r, c, dist;
		
		public Pos(int r, int c, int dist) {
			this.r = r;
			this.c = c;
			this.dist = dist;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Queue<Pos> q = new LinkedList<>();	// BFS를 위한 큐
		boolean[][] visited = new boolean[n][m];	// 이미 방문한 곳은 못가게 체크
		
		// 미로 입력받기
		char[][] maze = new char[n][m];
		for (int i=0; i<n; i++) {
			String row = br.readLine();
			for (int j=0; j<m; j++) {
				maze[i][j] = row.charAt(j);
			}
		}
		// 출발지 정보 입력
		q.add(new Pos(0, 0, 1));	// 시작위치 1,1 and 지나간 칸수 1
		visited[0][0] = true;	// 시작위치를 큐에 넣었으니 방문한 것으로 체크
		
		// BFS 진행
		while (!q.isEmpty()) {
			Pos cur = q.poll();		// 큐에서 하나를 꺼냄
			for (int i=0; i<4; i++) {
				int[] x = {1, 0, -1, 0};
				int[] y = {0, 1, 0, -1};
				int nextN = cur.r + x[i];
				int nextM = cur.c + y[i];
				int nextDist = cur.dist + 1;
				
				// 다음 탐색할 위치가 미로를 벗어났거나 이미 방문한 곳면 제외
				if (nextN < 0 || nextN >= n || nextM < 0 || nextM >= m || 
						visited[nextN][nextM] || maze[nextN][nextM] == '0') {
					continue;
				}
				
				if (nextN == n-1 && nextM == m-1) {		// 최종 목적지를 발견한 경우
					System.out.println(nextDist);
					return;
				}
				
				q.add(new Pos(nextN, nextM, nextDist));	// 큐에 다음 탐색할 곳을 넣음
				visited[nextN][nextM] = true;	// 큐에 넣은 곳 방문한 것으로 체크
			}
		}
	}
}