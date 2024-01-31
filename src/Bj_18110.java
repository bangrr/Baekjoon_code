import java.io.*;
import java.util.*;

public class Bj_18110 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int c = (int) Math.round((double)(n * 15) / 100);
		int sum = 0;
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		for (int i=0; i<c; i++) {
			sum -= arr[i];
			sum -= arr[n-1-i];
		}
		System.out.println((int) Math.round((double)sum/(n-c*2)));
	}
}