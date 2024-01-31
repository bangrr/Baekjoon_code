import java.io.*;
import java.util.*;

public class Bj_18917 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(br.readLine());
		long sum = 0;
		long xor = 0;
		
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			
			if (q==1) {
				int x = Integer.parseInt(st.nextToken());
				sum += x;
				xor ^= x;
			} else if (q==2) {
				int x = Integer.parseInt(st.nextToken());
				sum -= x;
				xor ^= x;
			} else if (q==3) {
				sb.append(sum + "\n");
			} else if (q==4) {
				sb.append(xor + "\n");
			}
		}
		System.out.print(sb);
	}
}