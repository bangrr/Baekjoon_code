import java.io.*;
import java.util.*;

public class Bj_25375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int q = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			if (b%a == 0 && a != b) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}
		System.out.print(sb);
	}
}