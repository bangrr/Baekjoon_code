import java.io.*;
import java.util.*;

public class Bj_10812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		int[] ans = new int[N+1];
		for (int p=1; p<=N; p++) {
			arr[p] = p;
			ans[p] = p;
		}
		
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			for (int p = i; p < k; p++) { // k ~ j
				ans[j+1-k+p] = arr[p];
			}
			for (int p = k; p <= j; p++) { // i ~ k-1
				ans[i+p-k] = arr[p]; 
			}
			for (int p = 1; p <= j; p++) { // Copy ans[] to arr[]
				arr[p] = ans[p];
			}
		}
		for (int p = 1; p <= N; p++) {
			sb.append(ans[p]).append(" ");
		}
		System.out.print(sb.toString());
	}
}