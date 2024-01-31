import java.io.*;
import java.util.*;

public class Bj_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Set<String> one = new HashSet<String>();
		Set<String> both = new TreeSet<String>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<n; i++) {
			one.add(br.readLine());
		}
		for (int i=0; i<m; i++) {
			String s = br.readLine();
			if (one.contains(s)) {
				both.add(s);
			}
		}
		sb.append(both.size()).append("\n");
		for (String s : both) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}