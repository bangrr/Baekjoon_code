import java.io.*;

public class Bj_25497 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0, lc = 0, sc = 0;
		
		char[] c = br.readLine().toCharArray();
		for (int i=0; i<n; i++) {
			if ('1' <= c[i] && c[i] <= '9') {
				ans++;
			}
			if (c[i] == 'L') {
				lc++;
			}
			if (c[i] == 'S') {
				sc++;
			}
			if (c[i] == 'R') {
				lc--;
				if (lc < 0) {
					break;
				}
				ans++;
			}
			if (c[i] == 'K') {
				sc--;
				if (sc < 0) {
					break;
				}
				ans++;
			}
		}
		System.out.println(ans);
	}
}