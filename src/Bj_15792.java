import java.io.*;
import java.util.*;

public class Bj_15792 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int a, b, c;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = 0;
		while (c > -1) {
			if (c == 1) {
				sb.append(".");
			}
			if (a < b) {
				sb.append(0);
				a *= 10;
			} else {
				sb.append(a/b);
				a = a%b*10;
			}
			if (a == 0) {
				break;
			}
			if (c > 1000) break;
			c++;
		}
	}
}