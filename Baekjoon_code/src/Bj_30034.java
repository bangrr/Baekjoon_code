import java.io.*;
import java.util.*;

public class Bj_30034 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		Set<String> set = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			String t = st.nextToken();
			set.add(t);
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			String t = st.nextToken();
			set.add(t);
		}
		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (k-- > 0) {
			String t = st.nextToken();
			if (set.contains(t)) { set.remove(t); }
		}
		int len = Integer.parseInt(br.readLine());
		String s = br.readLine();
		for (String item : set) {
			s = s.replaceAll(item, " ");
		}
		for (String str : s.split(" ")) {
			if (!str.equals("")) {
				System.out.println(str);
			}
		}
	}
}