import java.io.*;
import java.util.*;

public class Bj_28062 {
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
		int sum = 0;
		boolean isOddOdd = false;
		int minOdd = 1000;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int candy = Integer.parseInt(st.nextToken());
			sum += candy;
			if (candy % 2 != 0) {
				if(isOddOdd) {
					isOddOdd = false;
				} else {
					isOddOdd = true;
				}
				minOdd = Math.min(minOdd, candy);
			}
		}
		
		if (isOddOdd) {
			sum -= minOdd;
		}
		System.out.print(sum);
	}
}