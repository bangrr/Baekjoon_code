import java.io.*;
import java.util.*;

public class Bj_17390 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n+1];
		arr[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		Integer[] sum = new Integer[n+1];
		sum[0] = 0;
		for (int i=1; i<=n; i++) {
			sum[i] = sum[i-1] + arr[i];
		}
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(sum[b]-sum[a-1]).append("\n");
		}
		System.out.print(sb);
	}
}