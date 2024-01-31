import java.io.*;
import java.util.*;

public class Bj_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[10];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		for (int i=n-1; i>=0; i--) {
			while (k > 0) {
				k -= arr[i];
				if (k >= 0) {
					cnt++;
				} else {
					k += arr[i];
					break;
				}
			}
		}
		System.out.print(cnt);
	}
}