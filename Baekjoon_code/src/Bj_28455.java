import java.io.*;
import java.util.*;

public class Bj_28455 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	final static int u1 = 60;
	final static int u2 = 100;
	final static int u3 = 140;
	final static int u4 = 200;
	final static int u5 = 250;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		Integer[] a = new Integer[n];
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a, Collections.reverseOrder());
		
		int l = 0;
		int s = 0;
		for (int i=0; i<Math.min(a.length, 42); i++) {
			l += a[i];
			if (a[i] >= u5) {
				s += 5;
			} else if (a[i] >= u4) {
				s += 4;
			} else if (a[i] >= u3) {
				s += 3;
			} else if (a[i] >= u2) {
				s += 2;
			} else if (a[i] >= u1) {
				s += 1;
			} 
		}
		sb.append(l).append(" ").append(s);
	}
}