import java.io.*;
import java.util.*;

public class Bj_7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int[] ans = new int[n];
		Arrays.fill(ans, 1);
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					ans[i]++;
				}
			}
		}
		for (int i=0; i<n; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
