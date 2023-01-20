import java.io.*;
import java.util.*;

public class Bj_11945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			for (int j=m-1; j>=0; j--) {
				sb.append(s.charAt(j));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}