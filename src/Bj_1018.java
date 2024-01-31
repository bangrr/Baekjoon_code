import java.io.*;
import java.util.*;

public class Bj_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[][] board = new boolean[n][m];
		int min = 64;
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			for (int j=0; j<m; j++) {
				if (str.charAt(j) == 'W') {
					board[i][j] = true;
				} else {
					board[i][j] = false;
				}
			}
		}
		
		for (int i=0; i<=n-8; i++) {
			for (int j=0; j<=m-8; j++) {
				int count = 0;
				boolean WB = board[i][j];
				for (int k=i; k<i+8; k++) {
					for (int l=j; l<j+8; l++) {
						if (board[k][l] != WB) {
							count++;
						}
						WB = !WB;
					}
					WB = !WB;
				}
				count = Math.min(count, 64-count);
				min = Math.min(min, count);
			}
		}
		System.out.print(min);
	}
}