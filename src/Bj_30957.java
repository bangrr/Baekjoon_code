import java.io.*;
import java.util.*;

public class Bj_30957 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int b = 0, s = 0, a = 0, m = 0;
		for (int i=0; i<n; i++) {
			char c = str.charAt(i);
			if (c == 'B') b++;
			else if (c == 'S') s++;
			else if (c == 'A') a++;
		}
		m = Math.max(b, Math.max(s, a));
		if (m == b && m == s && m == a) {
			System.out.print("SCU");
		} else {
			if (m == b) System.out.print("B");
			if (m == s) System.out.print("S");
			if (m == a) System.out.print("A");
		}
	}
}