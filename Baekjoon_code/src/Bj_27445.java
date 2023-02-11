import java.io.*;
import java.util.*;

public class Bj_27445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int c = 50;
		int r = 50;
		
		for (int i=0; i<n-1; i++) {
			int t = Integer.parseInt(br.readLine());
			c = Math.min(c, t);
		}
		
		st = new StringTokenizer(br.readLine());
		
		int tmp = Integer.parseInt(st.nextToken());
		c = Math.min(c, tmp);
		r = Math.min(r, tmp);
		
		for (int i=1; i<m; i++) {
			int t = Integer.parseInt(st.nextToken());
			r = Math.min(r, t);
		}
		
		System.out.print((n-r) + " " + (c+1));
	}
}