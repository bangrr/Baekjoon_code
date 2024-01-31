import java.io.*;
import java.util.*;

public class Bj_17906 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] w = new long[n];
		int[][] x = new int[m][2];
		long ans = 0; 
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			w[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(w);;
		
		for (int j=0; j<m; j++) {
			st = new StringTokenizer(br.readLine());
			x[j][0] = Integer.parseInt(st.nextToken());
			x[j][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x, (o1, o2) -> {
			return o2[1] - o1[1];
		});
		
		int j = 0;
		while (n > 0 && j < m) {
			while (x[j][0] > 0) {
				ans += w[n-1] * x[j][1];
				x[j][0]--;
				n--;
				if (n == 0) {
					break;
				}
			}
			j++;
		}
		System.out.println(ans);
	}
}