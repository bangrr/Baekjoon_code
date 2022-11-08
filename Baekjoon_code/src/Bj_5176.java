import java.io.*;
import java.util.*;

public class Bj_5176 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine());
		
		for (int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = p;
			boolean[] chk = new boolean[m+1];
			for (int j=0; j<p; j++) {
				int s = Integer.parseInt(br.readLine());
				if (!chk[s]) {
					cnt--;
					chk[s] = true;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}