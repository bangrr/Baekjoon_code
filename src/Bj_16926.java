import java.io.*;
import java.util.*;

public class Bj_16926 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, m, r;
	static int[][] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		while (r-- > 0) {
			rotate(arr);
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static void rotate(int[][] arr) {
		for (int i=0; i<Math.min(n, m)/2; i++) {
			int x=i, y=i;
			int tmp = arr[y][x];
			for (int j=i; j<m-1-i; j++) {
				arr[y][x] = arr[y][++x];
			}
			for (int j=i; j<n-1-i; j++) {
				arr[y][x] = arr[++y][x];
			}
			for (int j=i; j<m-1-i; j++) {
				arr[y][x] = arr[y][--x];
			}
			for (int j=i; j<n-1-i; j++) {
				arr[y][x] = arr[--y][x];
			}
			arr[y+1][x] = tmp;
		}
	}
}