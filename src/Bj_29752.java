import java.io.*;
import java.util.*;

public class Bj_29752 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int ans = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int s = Integer.parseInt(st.nextToken());
			if (s == 0) {
				ans = Math.max(cnt, ans);
				cnt = 0;
			} else {
				cnt++;
			}
		}
		ans = Math.max(cnt, ans);
		System.out.println(ans);
	}
}