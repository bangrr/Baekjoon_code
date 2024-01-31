import java.io.*;
import java.util.*;

public class Bj_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		long[] sum = new long[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		long ans = 0;
		for (int i=0; i<n; i++) {
			for (int j=i; j>=0; j--) {
				sum[i] += arr[j];
			}
			ans += sum[i];
		}
		System.out.print(ans);
	}
}