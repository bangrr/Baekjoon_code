import java.io.*;
import java.util.*;

public class Bj_9093 {
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
			String[] s = br.readLine().split(" ");
			for (int i=0; i<s.length; i++) {
				for (int j=s[i].length()-1; j>=0; j--) {
					sb.append(s[i].charAt(j));
				}
				sb.append(" ");
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("\n");
		}
	}
}