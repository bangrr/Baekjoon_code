import java.io.*;
import java.util.*;

public class Bj_5101 {
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
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && d == 0 && b == 0) {
				break;
			}
			if (b-a >0 && d < 0 || b-a < 0 && d > 0) {
				sb.append("X\n");
				continue;
			}
			sb.append((b-a)%d==0?Math.abs((b-a)/d)+1:"X").append("\n");
		}
	}
}