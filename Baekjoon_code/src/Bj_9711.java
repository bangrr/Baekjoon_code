import java.util.*;
import java.io.*;

public class Bj_9711 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			long a = 1;
			long b = 1;
			long c = a + b;
			
			
			if (p<=2) {
				c = 1%q;
			} else {
				for (int j=3; j<=p; j++) {
					c = (a + b)%q;
					a = b;
					b = c;
				}
			}
			sb.append("Case #" + i + ": " + c + "\n");
		}
		System.out.print(sb);
	}
}