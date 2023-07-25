import java.io.*;
import java.util.*;

public class Bj_28249 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		while (n-- > 0) {
			char c = br.readLine().charAt(0);
			if (c == 'P') {
				a += 1500;
			} else if (c == 'M') {
				a += 6000;
			} else if (c == 'S') {
				a += 15500;
			} else if (c == 'C') {
				a += 40000;
			} else if (c == 'T') {
				a += 75000;
			} else if (c == 'H') {
				a += 125000;
			}
		}
		System.out.print(a);
	}
}