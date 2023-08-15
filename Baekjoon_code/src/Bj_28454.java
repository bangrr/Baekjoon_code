import java.io.*;
import java.util.*;

public class Bj_28454 {
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
		String s = br.readLine(); // validDate
		int n = Integer.parseInt(br.readLine());
		int c = 0;
		while (n-- > 0) {
			String d = br.readLine();
			if (s.compareTo(d) <= 0) {
				c++;
			}
		}
		sb.append(c);
	}
}