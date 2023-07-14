import java.io.*;
import java.util.*;

public class Bj_15025 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		if (l==0 && r==0) {
			System.out.println("Not a moose");
		} else if (l == r) {
			System.out.println("Even " + l*2);
		} else {
			System.out.println("Odd " + Math.max(l, r)*2);
		}
	}
}