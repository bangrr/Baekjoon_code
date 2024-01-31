import java.io.*;
import java.util.*;

public class Bj_1009 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int[][] arr = {{0},{1},{2,4,8,6},{3,9,7,1},{4,6},{5},{6},{7,9,3,1},{8,4,2,6},{9,1}};
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			find(a, b);
		}
	}
	
	// 문제해결
	static void find(int a, int b) {
		a %= 10;
		if (b%arr[a].length == 0) {
			b = arr[a].length-1;
		} else {
			b = b%arr[a].length-1;
		}
		int ans = arr[a][b];
		if (ans == 0) {
			ans = 10;
		}
		sb.append(ans).append("\n");
	}
}