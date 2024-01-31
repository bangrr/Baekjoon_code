import java.io.*;
import java.util.*;

public class Bj_17219 {
	public static void main(String[] arrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<String, String> map = new HashMap<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		for (int i=0; i<m; i++) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
}