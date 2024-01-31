import java.io.*;
import java.util.*;

public class Bj_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		long max = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = arr[i] > max ? arr[i] : max;
		}
		max++;
		
		long lo = 0;
		long hi = max;
		long ans = 0;
		
		while (lo < hi) {
			ans = (lo+hi) / 2;
			long sum = 0;
			
			for (int i=0; i<n; i++) {
				sum += Math.max(0, arr[i] - ans);
			}
			
			if (sum < m) {
				hi = ans;
			} else {
				lo = ans + 1;
			}
		}
		System.out.print(lo-1);
	}
}