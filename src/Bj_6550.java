import java.io.*;
import java.util.*;

public class Bj_6550 {
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
		String str;
		while ((str = br.readLine()) != null) {
			String[] arr = str.split(" ");
			String s = arr[0];
			String t = arr[1];
			int si = 0, ti = 0;
			while (si < s.length()) {
				while (ti < t.length()) {
					if (s.charAt(si) == t.charAt(ti)) {
						si++; ti++; break;
					} else {
						ti++;	
					}
				}
				if (ti == t.length()) {
					break;
				}
			}
			sb.append(si == s.length() ? "Yes\n" : "No\n");
		}
	}
}