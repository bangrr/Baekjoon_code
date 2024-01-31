import java.io.*;
import java.util.*;

public class Bj_4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			double sum = 0;
			int[] a = new int[n];
			int cnt = 0;
			for (int j=0; j<n; j++) {
				a[j] = Integer.parseInt(st.nextToken());
				sum += a[j];
			}
			for (int j=0; j<n; j++) {
				if (sum/n < a[j]) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (double)cnt/n*100);
		}
	}
}