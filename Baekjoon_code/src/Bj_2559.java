import java.io.*;
import java.util.*;

public class Bj_2559 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[N+1];
		int[] S = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			S[i] = S[i-1] + A[i];
		}
		
		int max = -12345678;
		for (int i=1; i+K-1<=N; i++) {
			max = Math.max(max, S[i+K-1] - S[i-1]);
		}
		
		System.out.println(max);
	}
}