import java.io.*;
import java.util.*;

public class Bj_5357 {
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
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			if (s.length() == 0) {
				sb.append("\n");
				continue;
			}
			char c = '\0';
			for (int i=0; i<s.length(); i++) {
				if (c != s.charAt(i)) {
					c = s.charAt(i);
					sb.append(s.charAt(i));
				}
			}
			sb.append("\n");
		}
	}
}