import java.io.*;
import java.util.*;

public class Bj_17173 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[1001];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			int k = Integer.parseInt(st.nextToken());
			for (int i=k; i<=n; i+=k) {
				if (!arr[i]) {
					arr[i] = true;
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
}