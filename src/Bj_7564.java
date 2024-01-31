import java.io.*;
import java.util.*;

public class Bj_7564 {
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
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			String e = br.readLine();
			
			int ts1 = -1, ts2 = -1, te1 = -1, te2 = -1;
			String c1 = null, c2 = null, cs = "", ce = "";
			
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j) == '<') {
					if (ts1 == -1) {
						ts1 = j;
					} else {
						ts2 = j;
						cs = s.substring(te1+1, ts2);
					}
				}
				if (s.charAt(j) == '>') {
					if (te1 == -1) {
						te1 = j;
					} else {
						te2 = j;
						ce = s.substring(te2+1);
					}
					if (c1 == null) {
						c1 = s.substring(ts1+1, te1);
					} else {
						c2 = s.substring(ts2+1, te2);
					}
				}
			}
			s = s.replaceAll("<", "").replaceAll(">", "");
			sb.append(s).append("\n");
			sb.append(e.substring(0, e.length()-3)).append(c2).append(cs).append(c1).append(ce).append("\n");
		}
	}
}