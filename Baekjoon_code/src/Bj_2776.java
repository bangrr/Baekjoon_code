import java.io.*;
import java.util.*;

public class Bj_2776 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int t, n, m;
	static Set<Integer> set;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			set = new HashSet<>();
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				set.add(Integer.parseInt(st.nextToken()));
			}
			m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<m; i++) {
				if (set.contains(Integer.parseInt(st.nextToken()))) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				sb.append("\n");
			}
		}
	}
}