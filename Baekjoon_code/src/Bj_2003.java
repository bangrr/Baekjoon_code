import java.io.*;
import java.util.*;

public class Bj_2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int srt = 0, end = 0;
		int sum = a[0], cnt = 0;
		
		while(end < n) {
			if (sum == m) {
				cnt++;
			}
			if (sum < m) {
				end++;
				sum = sum + a[end];
			} else {
				sum = sum - a[srt];
				srt++;
			}
		}
		System.out.println(cnt);
	}
}