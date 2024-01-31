import java.io.*;
import java.util.*;

public class Bj_9610 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;
	
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
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			chk(x, y);
		}
		sb.append("Q1: " + Q1).append("\n");
		sb.append("Q2: " + Q2).append("\n");
		sb.append("Q3: " + Q3).append("\n");
		sb.append("Q4: " + Q4).append("\n");
		sb.append("AXIS: " + AXIS);
	}
	
	// 문제해결
	static void chk(int x, int y) {
		if (x == 0 || y == 0) {
			AXIS++;
		} else if (x > 0 && y > 0) {
			Q1++;
		} else if (x < 0 && y > 0) {
			Q2++;
		} else if (x < 0 && y < 0) {
			Q3++;
		} else if (x > 0 && y < 0) {
			Q4++;
		}
	}
}