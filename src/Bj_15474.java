import java.io.*;
import java.util.*;

public class Bj_15474 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		if (n % a == 0) {
			b *= n/a;
		} else {
			b *= n/a+1;
		}
		
		if (n % c == 0) {
			d *= n/c;
		} else {
			d *= n/c+1;
		}
		
		System.out.print(Math.min(b, d));
	}
}