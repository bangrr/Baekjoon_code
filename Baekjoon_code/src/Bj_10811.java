import java.io.*;
import java.util.*;

public class Bj_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		for (int i=1; i<n+1; i++) {
			arr[i] = i;
		}
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			while (i < j) {
				arr[0] = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[0];
				i++;
				j--;
			}
		}
		
		for (int i=1; i<n+1; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.print(sb.toString());
	}
}