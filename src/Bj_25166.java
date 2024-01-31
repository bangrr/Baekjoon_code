import java.io.*;
import java.util.*;

public class Bj_25166 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (s <= 1023) {
			System.out.println("No thanks");
			return;
		}
		
		int a = 1;
		while (a <= s && a <= 512) {
			a *= 2;
		}
		a /= 2;
		
		while (a >= 1) {
			s -= a;
			if (s < 0) {
				s += a;
			}
			a /= 2;
		}
		
		String k = Integer.toBinaryString(m);
		for (int i=0; i<k.length(); i++) {
			if (k.charAt(i) == '1') {
				if (s-Math.pow(2, k.length()-1-i) >= 0) {
					s -= Math.pow(2, k.length()-1-i);
				}
			}
		}
		if (s == 0) {
			System.out.println("Thanks");
		} else {
			System.out.println("Impossible");
		}
	}
}