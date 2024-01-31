import java.io.*;
import java.util.*;

public class Bj_14720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int chk = 0;
		int ans = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (chk == tmp) {
				ans++;
				if (chk == 0) {
					chk = 1;
				} else if (chk == 1) {
					chk = 2;
				} else if (chk == 2) {
					chk = 0;
				}
			}
		}
		System.out.print(ans);
	}
}