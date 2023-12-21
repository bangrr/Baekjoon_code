import java.io.*;
import java.util.*;

public class Bj_10709 {
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
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int[][] arr = new int[h][w];
		boolean one = false;
		
		for (int i=0; i<h; i++) {
			String s = br.readLine();
			for (int j=0; j<w; j++) {
				char c = s.charAt(j);
				if (c == '.') {
					if (!one) {
						arr[i][j] = -1;
					} else {
						arr[i][j] = arr[i][j-1] + 1;
					}
				} else if (c == 'c') {
					arr[i][j] = 0;
					one = true;
				}
			}
			one = false;
		}
		
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
	}
}