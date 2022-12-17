import java.io.*;
import java.util.*;

public class Bj_17266 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] x = new int[m+2];
		x[0] = 0;
		x[m+1] = n;
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=m; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		for (int i=1; i<m+2; i++) {
			if (i == 1 || i == m+1) {
				ans = Math.max(x[i]-x[i-1], ans);
			} else {
				ans = Math.max((x[i]-x[i-1])/2 + (x[i]-x[i-1])%2, ans);
			}
		}
		System.out.print(ans);
	}
}