import java.io.*;
import java.util.*;

public class Bj_11660 {
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
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N+1][N+1];
		int[][] S = new int[N+1][N+1];
		
		for (int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				S[i][j] = S[i][j-1] + A[i][j];
			}
		}
		
		for (int j=1; j<=N; j++) {
			for (int i=1; i<=N; i++) {
				S[i][j] = S[i][j] + S[i-1][j];
			}
		}
		
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			sb.append(S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]).append("\n");
		}
	}
}