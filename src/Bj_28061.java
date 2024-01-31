import java.io.*;
import java.util.*;

public class Bj_28061 {
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
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			max = Math.max(max, Integer.parseInt(st.nextToken())-n+i);
		}
		System.out.print(max);
	}
}