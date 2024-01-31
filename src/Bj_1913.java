import java.io.*;

public class Bj_1913 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] table = new int[n+1][n+1];
		int p = n*n;
		int t = n;
		int py = 0;
		int px = 1;
		int[] dy = {1, 0, -1, 0};
		int[] dx = {0, 1, 0, -1};
		int d = 0;
		
		int a=0, b=0; // N+1번째 줄 입력받은 자연수 좌표
		
		while (p > 0) {
			for (int i=0; i<t; i++) {
				py += dy[d];
				px += dx[d];
				table[py][px] = p--;
				if (table[py][px] == m) {
					a = py;
					b = px;
				}
			}
			d = ++d % 4;
			if (d % 2 == 1) t--;
		}
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				sb.append(table[i][j]).append(" ");
			}
			sb.append("\n");
		}
		sb.append(a).append(" ").append(b);
		System.out.print(sb.toString());
	}
}