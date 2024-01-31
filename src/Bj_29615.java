import java.io.*;
import java.util.*;

public class Bj_29615 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] nArr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] mArr = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for (int i=0; i<m; i++) {
			int t = nArr[i];
			for (int j=0; j<m; j++) {
				if (t == mArr[j]) {
					cnt++;
					continue;
				}
			}
		}
		System.out.println(m-cnt);
	}
}