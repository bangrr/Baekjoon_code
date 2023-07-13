import java.io.*;
import java.util.*;

public class Bj_3058 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int sum = 0;
			int min = 100;
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<7; i++) {
				int a = Integer.parseInt(st.nextToken());
				if (a % 2 == 0) {
					sum += a;
					min = Math.min(min, a);
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}