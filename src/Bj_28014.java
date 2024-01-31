import java.io.*;
import java.util.*;

public class Bj_28014 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, c;
	static int[] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.println(c);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		c = 1;
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i=1; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i-1] <= arr[i]) {
				c++;
			}
		}
	}
}