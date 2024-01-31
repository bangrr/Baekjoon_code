import java.io.*;
import java.util.*;

public class Bj_10451 {
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
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			boolean[] chk = new boolean[n+1];
			int[] arr = new int[n+1];
			st = new StringTokenizer(br.readLine());
			for (int i=1; i<=n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			for (int i=1; i<=n; i++) {
				if (chk[i]) continue;
				int next = i;
				while (!chk[next]) {
					chk[next] = true;
					next = arr[next];
				}
				cnt++;
			}
			sb.append(cnt).append("\n");
		}
	}
}