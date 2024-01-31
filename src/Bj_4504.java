import java.io.*;
import java.util.*;

public class Bj_4504 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, t;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		while (true) {
			t = Integer.parseInt(br.readLine());
			if (t == 0) {
				break;
			}
			check();
		}
	}

	static void check() {
		if (t % n == 0) {
			sb.append(t).append(" is a multiple of ").append(n).append(".\n");
		} else {
			sb.append(t).append(" is NOT a multiple of ").append(n).append(".\n");
		}
	}
}