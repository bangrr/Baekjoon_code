import java.io.*;
import java.util.*;

public class Bj_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (map.get(a) == null) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a)+1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			int k = Integer.parseInt(st.nextToken());
			sb.append(map.get(k)).append(" ");
		}
		System.out.print(sb.toString().replaceAll("null", "0"));
	}
}