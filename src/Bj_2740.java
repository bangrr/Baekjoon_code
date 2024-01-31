import java.io.*;
import java.util.*;

public class Bj_2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arrA = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				arrA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arrB = new int[m][k];
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<k; j++) {
				arrB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<k; j++) {
				int ans = 0;
				for (int h=0; h<m; h++) {
					ans += arrA[i][h] * arrB[h][j];
				}
				sb.append(ans + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}