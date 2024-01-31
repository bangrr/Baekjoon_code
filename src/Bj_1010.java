import java.io.*;
import java.util.*;

public class Bj_1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int ans = 1;
			for (int k = 1; k<=Math.min(n, m-n); k++) {
				ans *= m-k+1;
				if (ans % k == 0) {
					ans /= k;
				}
			}
			sb.append(String.valueOf(ans)).append("\n");
		}
		System.out.print(sb);
	}
}