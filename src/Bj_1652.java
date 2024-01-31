import java.io.*;

public class Bj_1652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] arr = new char[n][n];
		
		for (int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int wc = 0;
		int hc = 0;
		int wans = 0;
		int hans = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j] == '.') {
					wc++;
				} else if (arr[i][j] == 'X') {
					if (wc >= 2) {
						wans++;
					}
					wc = 0;
				}
				if (j == n-1) {
					if (wc >= 2) {
						wans++;
					}
					wc = 0;
				}
				
				if (arr[j][i] == '.') {
					hc++;
				} else if (arr[j][i] == 'X') {
					if (hc >= 2) {
						hans++;
					}
					hc = 0;
				}
				if (j == n-1) {
					if (hc >= 2) {
						hans++;
					}
					hc = 0;
				}
			}
		}
		System.out.println(wans + " " + hans);
	}
}