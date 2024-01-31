import java.io.*;
import java.util.*;

public class Bj_31000 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for (int a=-n; a<=n; a++) {
			if (a == 0) {
				ans += (n*2+1)*(n*2+1);
			} else {
				for (int b=-n; b<=n; b++) {
					if (-n <= 1-a-b && 1-a-b <= n) {
						ans++;
					}
				}
			}
		}
		System.out.print(ans);
	}
}