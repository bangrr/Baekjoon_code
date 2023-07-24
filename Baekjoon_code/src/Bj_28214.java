import java.io.*;
import java.util.*;

public class Bj_28214 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int c = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			int t = 0;
			for (int j=1; j<=k; j++) {
				if (Integer.parseInt(st.nextToken()) == 0) {
					t++;
				}
			}
			if (t < p) {
				c++;
			}
		}
		System.out.print(c);
	}
}