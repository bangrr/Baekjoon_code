import java.io.*;
import java.util.*;

public class Bj_5014 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int F, S, G, U, D, ans;
	static int[] mArr;
	static Queue<Integer> q;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		if (S != G) ans = bfs();
		System.out.print(ans < 0 ? "use the stairs" : ans);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		F = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		mArr = new int[F+1];
		q = new LinkedList<>();
		q.add(S);
	}
	
	// 문제해결
	static int bfs() {
		while (!q.isEmpty()) {
			int cur = q.poll();
			if (U > 0) {
				int up = cur+U;
				if (up <= F && mArr[up] == 0) {
					mArr[up] = mArr[cur]+1;
					if (!q.contains(up)) {
						q.add(up);
					}
				}
				if (up == G) {
					return mArr[up];
				}
			}
			if (D > 0) {
				int dw = cur-D;
				if (dw > 0 && mArr[dw] == 0) {
					mArr[dw] = mArr[cur]+1;
					if (!q.contains(dw)) {
						q.add(dw);
					}
				}
				if (dw == G) {
					return mArr[dw];
				}
			}
		}
		return -1;
	}
}