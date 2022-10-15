import java.io.*;
import java.util.*;

public class Bj_25793 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long r = Integer.parseInt(st.nextToken());
			long c = Integer.parseInt(st.nextToken());
			long dc = 0;
			long wc = 0;
			
			long n = Math.min(r, c);
			wc = 2 * (n*n*n - n) / 3 + Math.abs(r-c)*n*n;
			dc = wc + n;
			
			sb.append(dc+" "+wc+"\n");
		}
		System.out.print(sb);
	}
}