import java.io.*;
import java.util.*;

public class Bj_28324 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+2];
		arr[0] = arr[n+1] = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long sum = 0;
		for (int i=n+1; i>0; i--) {
			if (arr[i]+1 < arr[i-1]) {
				arr[i-1] = arr[i]+1;
			}
			sum = sum + arr[i-1];
		}
		System.out.print(sum);
	}
}