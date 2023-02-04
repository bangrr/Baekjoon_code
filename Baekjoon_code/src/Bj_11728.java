import java.io.*;
import java.util.*;

public class Bj_11728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i = 0;
		int j = 0;
		
		while (j < m) {
			if (i < n && arr1[i] < arr2[j]) {
				sb.append(arr1[i++]).append(" ");
			} else {
				sb.append(arr2[j++]).append(" ");
			}
		}
		while (i < n) {
			sb.append(arr1[i++]).append(" ");
		}
		System.out.print(sb.toString());
	}
}