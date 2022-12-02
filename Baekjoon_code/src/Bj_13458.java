import java.io.*;
import java.util.*;

public class Bj_13458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		long cnt = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] -= b;
			cnt++;
			if (arr[i] <= 0) {
				continue;
			}
			if (arr[i] % c == 0) {
				cnt += arr[i]/c;
			} else {
				cnt += arr[i]/c+1;
			}
		}
		sb.append(cnt);
		System.out.print(sb);
	}
}