import java.io.*;
import java.util.*;

public class Bj_26509 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int[] a = new int[3];
			int[] b = new int[3];
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<3; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<3; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(a);
			Arrays.sort(b);
			if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2] && a[0]*a[0] + a[1]*a[1] == a[2]*a[2]) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
	}
}