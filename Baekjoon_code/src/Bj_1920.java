import java.util.*;
import java.io.*;

public class Bj_1920 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			int b = Integer.parseInt(st.nextToken());
			int srt = 0;
			int end = n-1;
			while (srt <= end) {
				int p = (srt+end)/2;
				if (a[p] == b) {
					sb.append(1);
					break;
				} else if (a[p] < b) {
					srt = p+1;
				} else if (a[p] > b) {
					end = p-1;
				}
			}
			if (srt > end) {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}