import java.io.*;
import java.util.*;

public class Bj_9094 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) { // 0 < n,m <= 100
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for (int a=1; a<n-1; a++) {
				for (int b=a+1; b<n; b++) {
					if((a*a+b*b+m)%(a*b)==0) cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}