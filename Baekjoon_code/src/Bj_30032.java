import java.io.*;
import java.util.*;

public class Bj_30032 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			if (d == 1) {
				for (int j=0; j<s.length(); j++) {
					char c = s.charAt(j);
					if (c == 'd') {
						sb.append("q");
					} else if (c == 'b') {
						sb.append("p");
					} else if (c == 'q') {
						sb.append("d");
					} else if (c == 'p') {
						sb.append("b");
					}
				}
			} else if (d == 2) {
				for (int j=0; j<s.length(); j++) {
					char c = s.charAt(j);
					if (c == 'd') {
						sb.append("b");
					} else if (c == 'b') {
						sb.append("d");
					} else if (c == 'q') {
						sb.append("p");
					} else if (c == 'p') {
						sb.append("q");
					}
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}