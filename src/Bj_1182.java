import java.io.*;
import java.util.*;

public class Bj_1182 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int n, s, ans;
	static int[] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		solution(0, 0);
		
		if (s == 0) ans--;
		System.out.print(ans);
	}
	
	static void solution(int depth, int sum) {
		if (depth == n) {
			if (s == sum) ans++;
			return;
		}
		solution(depth+1, sum);
		solution(depth+1, sum+arr[depth]);
	}
}