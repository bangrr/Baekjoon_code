import java.io.*;
import java.util.*;

public class Bj_9085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int s = 0;
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				s += Integer.parseInt(st.nextToken());
			}
			sb.append(s).append("\n");
		}
		System.out.print(sb.toString());
	}
}