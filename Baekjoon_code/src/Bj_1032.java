import java.io.*;
import java.util.*;

public class Bj_1032 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		char[] ans = br.readLine().toCharArray();
		for (int i=1; i<n; i++) {
			String s = br.readLine();
			for (int j=0; j<ans.length; j++) {
				if (ans[j] != s.charAt(j)) {
					ans[j] = '?';
				}
			}
		}
		for (int i=0; i<ans.length; i++) {
			sb.append(ans[i]);
		}
		System.out.print(sb);
	}
}