import java.io.*;
import java.util.*;

public class Bj_28281 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int min = 2000000000;
		
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (i > 0) {
				a[i-1] += a[i];
				min = Math.min(min, a[i-1]*x);
			}
		}
		System.out.print(min);
	}
}