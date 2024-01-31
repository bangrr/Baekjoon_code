import java.io.*;
import java.util.*;

public class Bj_1362 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=1;;i++) {
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			boolean b = false;
			if (o == 0) {
				break;
			}
			while(o != 0) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				if (b) {
					if ("#".equals(s)) {
						break;
					}
					continue;
				}
				if ("F".equals(s)) {
					w += n;
				} else if ("E".equals(s)) {
					w -= n;
					if (w <= 0) {
						b = true;
						sb.append(i + " RIP\n");
					}
				} else if ("#".equals(s)) {
					break;
				}
			}
			if (w > 0.5*o && w < 2*o) {
				sb.append(i + " :-)\n");
			} else if (w > 0) {
				sb.append(i + " :-(\n");
			}
		}
		System.out.print(sb.toString());
	}
}