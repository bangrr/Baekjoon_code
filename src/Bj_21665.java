import java.io.*;
import java.util.StringTokenizer;

public class Bj_21665 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] s = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = br.readLine();
		}
		
		int cnt = 0;
		String[] c = new String[n];
		c[0] = br.readLine();
		for (int i=0; i<n; i++) {
			c[i] = br.readLine();
			for (int j=0; j<m; j++) {
				if (s[i].charAt(j) == c[i].charAt(j)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}