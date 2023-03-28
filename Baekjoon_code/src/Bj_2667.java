import java.io.*;
import java.util.*;

public class Bj_2667 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 지도 크기 입력
		int n = Integer.parseInt(br.readLine());
		
		// 지도 채우기
		int[][] map = new int[n+1][n+1];
		for (int i=1; i<=n; i++) {
			String s = br.readLine();
			for (int j=1; j<=n; j++) {
				map[i][j] = s.charAt(j-1)-48;
			}
		}
		
		Queue<Pair2667> queue = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int[] dx = new int[] {1, 0, -1, 0};
		int[] dy = new int[] {0, 1, 0, -1};
		
		int dan = 0; // 총 단지수
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 2; // 방문체크를 2로 하기
					continue;
				} else if (map[i][j] == 2) { // 방문했으니까 skip
					continue;
				}
				
				if (map[i][j] == 1) { // map[i][j] != 1 일때 skip
					dan++;
					int zip = 0; // 각 단지내 집 수
					queue.offer(new Pair2667(i, j));
					map[i][j] = 2; // 방문체크를 2로 하기
					while (!queue.isEmpty()) {
						zip++;
						Pair2667 cur = queue.poll();
						for (int k=0; k<4; k++) {
							int nx = cur.x + dx[k];
							int ny = cur.y + dy[k];
							if (nx < 1 || nx > n || ny < 1 || ny > n) {
								continue;
							}
							if (map[nx][ny] == 1) {
								queue.offer(new Pair2667(nx, ny));
								map[nx][ny] = 2; // 방문체크를 2로 하기
							}
						}
					}
					ans.add(zip);
				}
			}
		}
		Collections.sort(ans);
		for (int i=0; i<ans.size(); i++) {
			sb.append(ans.get(i)).append("\n");
		}
		System.out.println(dan); // 총 단지수
		System.out.print(sb.toString()); // 각 단지내 집 출력
	}
	
	public static class Pair2667 {
		int x;
		int y;
		
		public Pair2667(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
	}
}