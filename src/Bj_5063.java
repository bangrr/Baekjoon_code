import java.io.*;
import java.util.*;

public class Bj_5063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (r < e-c) {
				sb.append("advertise\n");
			} else if (r > e-c) {
				sb.append("do not advertise\n");
			} else {
				sb.append("does not matter\n");
			}
		}
		System.out.print(sb);
	}
}