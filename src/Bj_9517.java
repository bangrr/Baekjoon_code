import java.io.*;
import java.util.*;

public class Bj_9517 {
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
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int b = 210;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			char z = st.nextToken().charAt(0);
			
			b -= t;
			if (b <= 0) {
				sb.append(k);
				return;
			}
			
			if (z == 'T') {
				k = k % 8 + 1;
			}
		}
	}
}