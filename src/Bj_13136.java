import java.io.*;
import java.util.*;

public class Bj_13136 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		long r = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		
		if (r % n != 0) {
			r /= n;
			r++;
		} else {
			r /= n;
		}
		if (c % n != 0) {
			c /= n;
			c++;
		} else {
			c /= n;
		}
		System.out.println(r*c);
	}
}