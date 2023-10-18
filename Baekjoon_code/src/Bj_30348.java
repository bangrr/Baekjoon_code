import java.io.*;
import java.util.*;

public class Bj_30348 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int ans = 111111;
		while (n-- > 0) {
			String s = br.readLine();
			int cnt = 0;
			if (s.length() > 1 && s.charAt(0) == s.charAt(1)) {
				cnt++;
				for (int i=2; i<s.length(); i++) {
					if (s.charAt(i-1) != s.charAt(i)) {
						break;
					}
					cnt++;
				}
			} else if (s.length() > 1 && s.charAt(0) < s.charAt(1)) {
				cnt++;
				for (int i=2; i<s.length(); i++) {
					if (s.charAt(i-1) >= s.charAt(i)) {
						break;
					}
					cnt++;
				}
			}
			if (cnt == s.length()-1) {
				ans = Math.min(ans, Integer.parseInt(s));
			}
		}
		if (ans == 111111) {
			System.out.println("NERASTA");
		} else {
			System.out.println(ans);
		}
	}
}