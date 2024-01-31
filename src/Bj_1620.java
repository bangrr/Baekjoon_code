import java.io.*;
import java.util.*;

public class Bj_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, String> intDocs = new HashMap<>();
		HashMap<String, Integer> strDocs = new HashMap<>();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			intDocs.put(i+1, s);
			strDocs.put(s, i+1);
		}
		for (int i=0; i<m; i++) {
			String s = br.readLine();
			if (s.charAt(0)<65) {
				sb.append(intDocs.get(Integer.valueOf(s))).append("\n");
			} else {
				sb.append(strDocs.get(s)).append("\n");
			}
		}
		System.out.print(sb);
	}
}