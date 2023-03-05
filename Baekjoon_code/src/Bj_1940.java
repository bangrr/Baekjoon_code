import java.io.*;
import java.util.*;

public class Bj_1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int cnt = 0;
		int sp = 0;
		int ep = n-1;
		
		while (sp < ep) {
			if (arr[sp] + arr[ep] < m) {
				sp++;
			} else if (arr[sp] + arr[ep] > m) {
				ep--;
			} else {
				cnt++;
				sp++;
				ep--;
			}
		}
		System.out.print(cnt);
	}
}