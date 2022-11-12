import java.io.*;
import java.util.*;

public class Bj_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		long max = 0;
		
		for (int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = arr[i] > max ? arr[i] : max;
		}
		max++;
		
		long lo = 0;
		long hi = max;
		long ans = 0;
		
		while (lo < hi) {
			ans = (lo+hi) / 2;
			long sum = 0;
			
			for (int i=0; i<k; i++) {
				sum += (arr[i] / ans);
			}
			
			if (sum < n) {
				hi = ans;
			} else {
				lo = ans + 1;
			}
		}
		System.out.print(lo-1);
	}
}