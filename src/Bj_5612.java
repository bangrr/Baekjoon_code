import java.io.*;
import java.util.*;

public class Bj_5612 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int s = m;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			m = m+Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken());
			s = Math.max(s, m);
			if (m < 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(s);
	}
}