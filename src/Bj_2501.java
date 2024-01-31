import java.io.*;
import java.util.*;

public class Bj_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = 0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				c++;
				if (c == k) {
					sb.append(i);
					break;
				}
			}
		}
		if (c < k) {
			sb.append(0);
		}
		System.out.print(sb);
	}
}