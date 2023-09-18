import java.io.*;
import java.util.*;

public class Bj_30033 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int b = Integer.parseInt(st.nextToken());
			if (arr[i] <= b) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}