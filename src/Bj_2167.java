import java.io.*;
import java.util.*;

public class Bj_2167 {
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
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][m+1];
		int[][] sss = new int[n+1][m+1];
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				sss[i][j] = sss[i][j-1] + arr[i][j];
			}
		}
		
		for (int j=1; j<=m; j++) {
			for (int i=1; i<=n; i++) {
				sss[i][j] = sss[i][j] + sss[i-1][j];
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			sb.append(sss[x2][y2] - sss[x1-1][y2] - sss[x2][y1-1] + sss[x1-1][y1-1]).append("\n");
		}
	}
}