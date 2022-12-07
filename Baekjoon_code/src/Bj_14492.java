import java.io.*;
import java.util.*;

public class Bj_14492 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		boolean[][] a = new boolean[n+1][n+1];
		boolean[][] b = new boolean[n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=n; j++) {
				if (st.nextToken().equals("0")) {
					a[i][j] = false;
				} else {
					a[i][j] = true;
				}
			}
		}
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=n; j++) {
				if (st.nextToken().equals("0")) {
					b[i][j] = false;
				} else {
					b[i][j] = true;
				}
			}
		}
		
		int cnt = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				boolean chk = false;
				for (int k=1; k<=n; k++) {
					chk |= a[i][k] & b[k][j];
					if (chk) {
						cnt++;
						break;
					}
				}
			}
		}
		System.out.print(cnt);
	}
}