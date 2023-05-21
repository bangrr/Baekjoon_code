import java.io.*;
import java.util.*;

public class Bj_27880 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
	}
	
	// 입력부
	static void input() throws IOException {
		int sum = 0;
		for (int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int x = Integer.parseInt(st.nextToken());
			if ("Es".equals(s)) {
				sum += x*21;
			} else {
				sum += x*17;
			}
		}
		System.out.print(sum);
	}
}