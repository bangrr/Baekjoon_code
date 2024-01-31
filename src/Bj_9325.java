import java.io.*;
import java.util.*;

public class Bj_9325 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int s = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				int q = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				s += q*p;
			}
			sb.append(s).append("\n");
		}
		System.out.print(sb.toString());
	}
}