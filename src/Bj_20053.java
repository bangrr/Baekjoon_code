import java.io.*;
import java.util.*;

public class Bj_20053 {
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
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int min = 1000000;
			int max = -1000000;
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				int a = Integer.parseInt(st.nextToken());
				min = Math.min(min, a);
				max = Math.max(max, a);
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
	}
}