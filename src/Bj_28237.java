import java.io.*;
import java.util.*;

public class Bj_28237 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		for (int a=1; a*a<=n; a++) {
			if (n % a == 0) {
				int c = n/a;
				for (int b=-5002; b<=5002; b++) {
					if (b != 0 && (n+2) % b == 0) {
						int d = -(n+2)/b;
						if (a*d + b*c == n+1) {
							System.out.print(a + " " + b + " " + c + " " + d);
							return;
						}
					}
				}
			}
		}
		System.out.print(-1);
	}
}