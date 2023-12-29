import java.io.*;
import java.util.*;

public class Bj_16956 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		char[][] arr = new char[r][c];
		for (int i=0; i<r; i++) {
			String s = br.readLine();
			for (int j=0; j<c; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (arr[i][j] == 'S') {
					if ((i-1 >= 0 && arr[i-1][j] == 'W') 
							|| (i+1 < r && arr[i+1][j] == 'W')
							|| (j-1 >= 0 && arr[i][j-1] == 'W')
							|| (j+1 < c && arr[i][j+1] == 'W')) {
						System.out.print(0);
						return;
					}
				}
			}
		}
		
		sb.append(1).append("\n");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (arr[i][j] == '.') sb.append('D');
				else sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}