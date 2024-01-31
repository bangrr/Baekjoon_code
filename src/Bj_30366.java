import java.io.*;
import java.util.*;

public class Bj_30366 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum = 0;
		int ans = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int t = Integer.parseInt(st.nextToken());
			if (sum + t > m) {
				sum = t;
				sb.append(++ans);
			} else {
				sum += t;
				sb.append(ans);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}