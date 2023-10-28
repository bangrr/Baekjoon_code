import java.io.*;
import java.util.*;

public class Bj_9237 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		int day = 1;
		for (int i=0; i<n; i++) {
			day = Math.max(day, i+2+arr[i]);
		}
		System.out.print(day);
	}
}