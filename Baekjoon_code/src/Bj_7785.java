import java.io.*;
import java.util.*;

public class Bj_7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>();
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if ("enter".equals(b)) {
				set.add(a);
			} else if ("leave".equals(b) && set.contains(a)) {
				set.remove(a);
			}
		}
		Object[] arr = set.toArray();
		for (int i = arr.length-1; i >= 0; i--) {
			sb.append((String)arr[i]).append("\n");
		}
		System.out.print(sb.toString());
	}
}