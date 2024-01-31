import java.io.*;
import java.util.*;

public class Bj_14561 {
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
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			chkPaldom(Long.toString(a, n));
		}
	}

	// 문제해결
	static void chkPaldom(String str) {
		for (int i=0; i<=str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				sb.append("0\n");
				return;
			}
		}
		sb.append("1\n");
	}
}