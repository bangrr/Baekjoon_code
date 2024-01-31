import java.io.*;
import java.util.*;

public class Bj_1500 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long p = 1;
		
		while (k > 0) {
			if (s % k == 0) {
				p *= (s/k);
				s -= (s/k);
			} else {
				p *= (s/k+1);
				s -= (s/k+1);
			}
			k--;
		}
		System.out.print(p);
	}
}