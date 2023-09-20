import java.io.*;
import java.util.*;

public class Bj_28419 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		long oddSum = 0;
		long evenSum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i % 2 == 0) {
				oddSum += arr[i];
			} else {
				evenSum += arr[i];
			}
		}
		if (n == 3 && oddSum > evenSum) {
			System.out.print(-1);
		} else {
			System.out.print(Math.abs(oddSum-evenSum));
		}
	}
}