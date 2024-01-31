import java.io.*;
import java.util.*;

public class Bj_5358 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s;
		while ((s = br.readLine()) != null) {
			for (int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'i') {
					sb.append('e');
				} else if (c == 'e') {
					sb.append('i');
				} else if (c == 'I') {
					sb.append('E');
				} else if (c == 'E') {
					sb.append('I');
				} else {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}