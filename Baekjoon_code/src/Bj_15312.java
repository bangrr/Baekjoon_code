import java.io.*;
import java.util.*;

public class Bj_15312 {
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
		String a = br.readLine();
		String b = br.readLine();
		int[] h = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int[] m = new int[a.length()+b.length()];
		for (int i=0; i<a.length(); i++) {
			m[i*2] = h[a.charAt(i)-'A'];
			m[i*2+1] = h[b.charAt(i)-'A'];
		}
		for (int i=0; i<m.length-2; i++) {
			for (int j=0; j<m.length-1-i; j++) {
				m[j] = (m[j] + m[j+1]) % 10;
			}
		}
		sb.append(m[0]).append(m[1]);
	}
}