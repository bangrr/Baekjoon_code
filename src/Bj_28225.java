import java.io.*;
import java.util.*;

public class Bj_28225 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		double time = 10000;
		int ans = 1;
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			double tmp = (f-x)/(double)v;
			if (time > tmp) {
				time = tmp;
				ans = i;
			}
		}
		System.out.print(ans);
	}
}