import java.io.*;
import java.util.*;

public class Bj_29736 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		k = k-x;
		x = k + x + x;
		
		int cnt = 0;
		for (int i=k; i<=x; i++) {
			if (i >= a && i <= b) {
				cnt++;
			}
		}
		if (cnt > 0) {
			System.out.println(cnt);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}