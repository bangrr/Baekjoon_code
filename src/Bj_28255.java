import java.io.*;
import java.util.*;

public class Bj_28255 {
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
			
			String pre;
			int len = s.length();
			if (len % 3 == 0) {
				pre = s.substring(0, len/3);
			} else {
				pre = s.substring(0, len/3+1);
			}
			
			String rev = "";
			for (int i=pre.length()-1; i>=0; i--) {
				rev += s.charAt(i);
			}
			
			String tailPre = pre.substring(1);
			
			String tailRev = rev.substring(1);
			
			String s1 = pre + rev + pre;
			String s2 = pre + tailRev + pre;
			String s3 = pre + rev + tailPre;
			String s4 = pre + tailRev + tailPre;
			
			if (s.equals(s1) || s.equals(s2) || s.equals(s3) || s.equals(s4)) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
	}
}