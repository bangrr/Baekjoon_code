import java.io.*;
import java.util.*;

public class Bj_3460 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = Integer.toBinaryString(n);
			for (int i=s.length()-1; i>=0; i--) {
				if (s.charAt(i) == '1') {
					sb.append(s.length()-1-i).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}