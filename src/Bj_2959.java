import java.io.*;
import java.util.*;

public class Bj_2959 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int[] a = new int[4];
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		a[2] = Integer.parseInt(st.nextToken());
		a[3] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		System.out.print(a[0]*a[2]);
	}
}