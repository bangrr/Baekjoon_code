import java.io.*;
import java.util.*;

public class Bj_9953 {
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
		int n;
		while ((n = Integer.parseInt(br.readLine())) != 0) {
			sb.append(binarySearch(n)).append("\n");
		}
	}
	
	static int binarySearch(int n) {
		int c = 0;
		if (n % 2 == 1) {
			n++;
			c++;
		}
		n/=2;
		
		int l = 1;
		int r = 50;
		while (l <= r) {
			c++;
			int m = (l + r) / 2;
			if (n == m) { break; }
			else if (n > m) { l = m + 1; }
			else { r = m - 1; }
		}
		return c;
	}
}