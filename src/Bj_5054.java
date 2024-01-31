import java.io.*;
import java.util.*;

public class Bj_5054 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int min = 99;
			int max = 0;
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				int x = Integer.parseInt(st.nextToken());
				min = Math.min(min, x);
				max = Math.max(max, x);
			}
			sb.append((max-min)*2).append("\n");
		}
		System.out.println(sb);
	}
}