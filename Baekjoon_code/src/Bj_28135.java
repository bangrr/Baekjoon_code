import java.io.*;
import java.util.*;

public class Bj_28135 {
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
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for (int i=1; i<n; i++) {
			cnt++;
			if (String.valueOf(i).contains("50")) {
				cnt++;
			}
		}
		System.out.print(cnt+1);
	}
}