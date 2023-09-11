import java.io.*;
import java.util.*;

public class Bj_29738 {
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
		int t = Integer.parseInt(br.readLine());
		for (int i=1; i<=t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append("Case #" + i + ": ");
			if (n > 4500) {
				sb.append("Round 1");
			} else if (n > 1000) {
				sb.append("Round 2");
			} else if (n > 25) {
				sb.append("Round 3");
			} else {
				sb.append("World Finals");
			}
			sb.append("\n");
		}
	}
}