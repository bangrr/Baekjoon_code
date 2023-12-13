import java.io.*;
import java.util.*;

public class Bj_1244 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int wm = Integer.parseInt(st.nextToken());
			int sw = Integer.parseInt(st.nextToken());
			if (wm == 1) {
				for (int i=sw; i<=n; i+=sw) {
					arr[i] = arr[i] == 0 ? 1 : 0;
				}
			} else if (wm == 2) {
				int p = 0;
				while (sw + p <= n && sw - p >= 1) {
					if (arr[sw+p] == arr[sw-p]) {
						arr[sw+p] = arr[sw-p] = arr[sw-p] == 0 ? 1 : 0;
					} else {
						break;
					}
					p++;
				}
			}
		}
		for (int i=1; i<=n; i++) {
			sb.append(arr[i]).append(" ");
			if (i % 20 == 0) {
				sb.append("\n");
			}
		}
	}
}